

#define Defog 0.000 // Strength of Lens Colors.
#define FogColor float4(0.0, 0.0, 0.0, 0.0) //Lens-style color filters for Blue, Red, Yellow, White.
#define Exposure 0.000
#define Gamma 1.000
#define BlueShift 0.10 // Higher = more blue in image.
#define VignetteCenter float2(0.500, 0.500) // Center of screen for effect.
#define VignetteRadius 1.00 // lower values = stronger radial effect from center
#define VignetteAmount -0.30 // Strength of black. -2.00 = Max Black, 1.00 = Max White.
#define saturation 0.02 // use negative values for less saturation.
#define Opacity 0.40 // Bleach Bypass values, higher = stronger effect.

#define NUM_SAMPLES2 4 //Number of samples, taken for the Bloomeffekt: Dont make that to high!! 4 are 25 Samples, 8 means 81 Samples per Pixel, 16 will be 289 Samples!, must be a divider of 2
float MinBloom = 0.70f; //The min level which the effect starts
float Samplescaler = 7.0f;	//Scaler for the sampler - the larger this one, the larger the area affectet
float BloomScale = 1.10f; // The Power of the Bloom


float sharpen = 0.01; //Controls the additional Sharpening - applied after the PP, this is a fast&simple one

// this two can be used to limit the range of the output - eg for Videorecording or TV´s or Testing purposes
float4 MinColor= float4(0.0f,0.0f,0.0f,0.0f);
float4 MaxColor= float4(1.0f,1.0f,1.0f,1.0f);



// comment these to deaktivate the Functions
#define USE_SHARPENING
#define USE_TONEMAP
#define USE_BLOOM
#define USE_LIMITER
#define USE_ADD_SHARPENING
	
float4 TonemapPass( float4 colorInput, float2 tex )
{
float4 color = colorInput;
color = max(0, color - Defog * FogColor);
color *= pow(2.0f, Exposure);
color = pow(color, Gamma);

float4 d = color * float4(1.05f, 0.97f, 1.27f, 1.0f);
color = lerp(color, d, BlueShift);

float3 lumCoeff = float3(0.299, 0.587, 0.114); // original float3(0.25, 0.65, 0.1) , changed to match the lumcalc of the Mainshader
float lum = dot (lumCoeff, color.rgb);
float3 blend = lum.rrr;
float L = min(1, max (0, 10 * (lum - 0.45)));
float3 result1 = 2.0f * color.rgb * blend;
float3 result2 = 1.0f - 2.0f * (1.0f - blend) * (1.0f - color.rgb);
float3 newColor = lerp(result1, result2, L);
float A2 = Opacity * color.rgb;
float3 mixRGB = A2 * newColor;
color.rgb += ((1.0f - A2) * mixRGB);

// Sepia Tones - float3(1.00, 1.00, 1.00) values are for R G B
// float gray = dot(color.rgb, float4(0.3, 0.59, 0.11, 0)); 
// color.rgb = float4(color.rgb * float3(1.00, 1.00, 1.00) , 1);

float2 tc = tex - VignetteCenter;
float v = length(tc) / VignetteRadius;
color += pow(v, 4) * VignetteAmount;

float4 middlegray = float(color.r + color.g + color.b) * 0.333;
float4 diffcolor = color - middlegray;
color += diffcolor *+ saturation;

return color;
}

float4 Bloom( float4 ColorInput2,float2 Tex  ) 
{

	float4 BlurColor2 =  0.0f;
	float4 BKThreshold = 0.0f;
	float NRGSamples = 1.0f;
	NRGSamples = NUM_SAMPLES2 /2;
float	MaxSamples = (NUM_SAMPLES2+1)*(NUM_SAMPLES2+1);
float 	MaxDistance = sqrt(NRGSamples*NRGSamples*2*Samplescaler);
float   CurDistance = MaxDistance;
float4	Blurtemp= 0;


			for(int Samplex = (- NRGSamples); Samplex < NRGSamples+1; Samplex = Samplex + 1)
	{
	


			for(int Sampley = (- NRGSamples); Sampley < NRGSamples+1; Sampley = Sampley + 1)
			{

		CurDistance = sqrt ( ((Samplex * Samplex) + (Sampley*Sampley))*Samplescaler);

		Blurtemp.rgb = tex2D(s0, float2(Tex.x +(Tex.x*Samplex*px*Samplescaler),Tex.y +(Tex.y*Sampley*py*Samplescaler)));

		BlurColor2.rgb += lerp(Blurtemp.rgb,ColorInput2.rgb, 1 - ((MaxDistance - CurDistance)/MaxDistance));

			}



	}


	BlurColor2.rgb = (BlurColor2.rgb / MaxSamples);
	

	float Bloomamount = saturate (    (dot(ColorInput2.xyz,float3(0.299, 0.587, 0.114))- MinBloom ) / MinBloom                 );
	float4	BlurColor = BlurColor2 * BloomScale;
		BlurColor2.rgb =lerp(ColorInput2,BlurColor, Bloomamount).rgb ;	
		BlurColor2.a = ColorInput2.a;
	return  BlurColor2;
}

float4 limiter (float4 orig,float2 tex)  // this has always to be the last pass
{   

    orig = (orig*(MaxColor-MinColor)+MinColor);
    
    return saturate (orig);
}  

float4 sharp( float4 orig,float2 tex ) 
{
// Strength should be from 0.0 to 1.0

float4 color;

color = 9.0 * orig;
color -= tex2D( s0, tex.xy + float2(px, py));
color -= tex2D( s0, tex.xy + float2(0.0, py));
color -= tex2D( s0, tex.xy + float2(-px, py));
color -= tex2D( s0, tex.xy + float2(-px, 0));

color -= tex2D( s0, tex.xy + float2(-px, -py));
color -= tex2D( s0, tex.xy + float2(0, -py));
color -= tex2D( s0, tex.xy + float2(px, -py));
color -= tex2D( s0, tex.xy + float2(px, 0));
color = color * sharpen + (1.0 - sharpen) * orig;
color.a = orig.a;

return color;
}


float4 main( float2 tex) {
//SharpenPass has to be the first pass because it samples multiple texels
#ifdef USE_SHARPENING
float4 pass1 = SharpenPass(tex);
#else
float4 pass1 = tex2D(s0,tex);
#endif
//Custom simple pass which would have used tex2D(s0, tex) but now uses pass1 as colorInput
#ifdef USE_TONEMAP
float4 pass2 = TonemapPass( pass1, tex);
#else
float4 pass2 = pass1;
#endif
//Bloompass
#ifdef USE_BLOOM
float4 pass3 = Bloom (pass2,tex);
#else
float4 pass3 = pass2;
#endif
// additional Sharpening pass
#ifdef USE_ADD_SHARPENING
float4 pass4 = sharp (pass3,tex);
#else
float4 pass4 = pass3;
#endif
//...more simple passes here ...
//...more simple passes here ...




// Limiter - always last
#ifdef USE_LIMITER
float4 pass5 = limiter (pass4,tex);
#else
float4 pass5 = pass4;
#endif

		
		//return final color
return pass4;
}