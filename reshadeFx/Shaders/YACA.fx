//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ReShade effect file
// visit facebook.com/MartyMcModding for news/updates
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Yet Another Chromatic Aberration by Marty McFly
// For private use only!
// Copyright © 2008-2015 Marty McFly
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

uniform int YACA_ImageChromaHues <
	ui_type = "drag";
	ui_min = 2; ui_max = 30;
	ui_tooltip = "Amount of samples through the light spectrum to get a smooth gradient.";
> = 25;
uniform float YACA_ImageChromaCurve <
	ui_type = "drag";
	ui_min = 0.5; ui_max = 2.0;
	ui_tooltip = "Image chromatic aberration curve. Higher means less chroma at screen center areas.";
> = 1.0;
uniform float YACA_ImageChromaAmount <
	ui_type = "drag";
	ui_min = 5.0; ui_max = 200.0;
	ui_tooltip = "Linearly increases image chromatic aberration amount.";
> = 100.0;
uniform bool bLastLineDependentEnable <
> = true;
uniform bool bShowSamplePoint <
> = false;
uniform bool bUseSpeed <
> = true;
uniform bool bUseMask <
> = false;
uniform float SamplePointX <
	ui_type = "drag";
	ui_min = -1.0; ui_max = 1.0;
	ui_tooltip = "X coordinateOfSamplePoint";
> = -1.0;
uniform float SamplePointY <
	ui_type = "drag";
	ui_min = -1.0; ui_max = 1.0;
	ui_tooltip = "Y coordinateOfSamplePoint";
> = 1.0;
uniform float MinValueToEnableEffect <
	ui_type = "drag";
	ui_min = 0; ui_max = 1.0;
	ui_tooltip = "Threshold value to enable effect";
> = 0.1;
uniform float SpeedDivider <
	ui_type = "drag";
	ui_min = 0; ui_max = 10000.0;
	ui_tooltip = "SpeedDivider";
> = 1000.0;
uniform float MaxDiffOfComponents <
	ui_type = "drag";
	ui_min = 0; ui_max = 1.0;
	ui_tooltip = "We are only interested in grays";
> = 0.01;
uniform float ChromaDampning <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 5.0;
	ui_tooltip = "";
> = 0.1;

uniform float SpeedOfCar < source = "speed_from_slrr"; >;

texture texMask < source = "YACAmask.png"; > { Width = 1920; Height = 1080; Format = RGBA8; };
sampler SamplerMask { Texture = texMask; };

texture texYACA2
{
	Width = BUFFER_WIDTH;
	Height = BUFFER_HEIGHT;
	Format = RGBA16F;
};
sampler SamplerYACA2 { Texture = texYACA2; };

#include "ReShade.fxh"

float3 PS_YACApushLastLine(float4 vpos : SV_Position, float2 texcoord : TEXCOORD) : SV_Target
{
		//texcoord.y *= 0.99;
		return tex2D(ReShade::BackBuffer,texcoord).xyz;
} 

float3 PS_YACA(float4 vpos : SV_Position, float2 texcoord : TEXCOORD) : SV_Target
{  
	//	float4 blurAmountVec = tex2D(ReShade::BackBuffer,float2(SamplePointX,SamplePointY));
	//	float diff = abs(blurAmountVec.x-blurAmountVec.y) + abs(blurAmountVec.x-blurAmountVec.z) + abs(blurAmountVec.z-blurAmountVec.y);
	//	float blurAmount = 1.0-smoothstep(0.0,MaxDiffOfComponents,diff);
	//	float maskMult = tex2D(SamplerMask,texcoord).x;
	//	if(!bUseMask)
	//	{
	//		maskMult = 1.0;
	//	}
	//	blurAmount *= saturate(blurAmountVec.x-MinValueToEnableEffect)*(1.0/(1.0-MinValueToEnableEffect));
	//	float realAmount = YACA_ImageChromaAmount;
	//	if(!bLastLineDependentEnable)
	//	{
	//		realAmount = YACA_ImageChromaAmount;
	//	}
	  float realAmount = YACA_ImageChromaAmount;
		if(bUseSpeed)
		{
			if(SpeedOfCar<10000000)
				realAmount *= (SpeedOfCar/SpeedDivider);
			else
				realAmount = 0;
		}
	// float toplineY = 0.001;
	// float3 topLineClolor = tex2D(ReShade::BackBuffer, float2(0.1,toplineY)).xyz +
	//								 tex2D(ReShade::BackBuffer, float2(0.15,toplineY)).xyz +
	//								 tex2D(ReShade::BackBuffer, float2(0.2,toplineY)).xyz +
	//								 tex2D(ReShade::BackBuffer, float2(0.25,toplineY)).xyz +
	//								 tex2D(ReShade::BackBuffer, float2(0.3,toplineY)).xyz;
	//	topLineClolor /= 5.0;
	//	
	// if(abs(topLineClolor.r-(222.0/255.0))+
	// abs(topLineClolor.g-(143.0/255.0))+
	// abs(topLineClolor.b-(0.0/255.0)) < 0.1)
	// {
	//	 realAmount = 0;
	// }
	// 
	// if(abs(topLineClolor.r-(252.0/255.0))< 0.1 &&
	// abs(topLineClolor.g-(107.0/255.0)) < 0.1 &&
	// abs(topLineClolor.b-(0.0/255.0)) < 0.1)
	// {
	//	 realAmount = 0;
	// }
		texcoord = texcoord * 2.0 - 1.0;
		float offsetfact = length(texcoord);
		offsetfact = pow(offsetfact, YACA_ImageChromaCurve) * realAmount * ReShade::PixelSize.x;
 
		float3 scenecolor = 0.0;
		float3 chromaweight = 0.0;
 
		[unroll]
		for (float c = 0; c < YACA_ImageChromaHues && c < 90; c++)
		{
				float  temphue = c / YACA_ImageChromaHues;
				float3 tempchroma = saturate(float3(abs(temphue * 6.0 - 3.0) - 1.0,2.0 - abs(temphue * 6.0 - 2.0),2.0 - abs(temphue * 6.0 - 4.0)));
				tempchroma = lerp(tempchroma,float3(1.01,1.01,1.01),float3(ChromaDampning,ChromaDampning,ChromaDampning));
				float  tempoffset = (c + 0.5) / YACA_ImageChromaHues - 0.5;
				float3 tempsample = tex2Dlod(SamplerYACA2, float4(texcoord * (1.0 + offsetfact * tempoffset) * 0.5 + 0.5, 0, 0)).xyz;

				scenecolor += tempsample * tempchroma;
				chromaweight += tempchroma;
		}

		//not all hues have the same brightness, FF0000 and FFFF00 are obviously differently bright but are just different hues.
		//there is no generic way to make it work for all different hue options. Sometimes / samples * 0.5 works, then * 0.666, then something completely different.
		scenecolor /= dot(chromaweight, 0.333);
 
	//	if(bShowSamplePoint)
	//	{
	//		if(abs(texcoord.x-SamplePointX) + abs(texcoord.y-SamplePointY) < 0.01)
	//		{
	//			scenecolor.r = 1.0;
	//			scenecolor.g = 0.0;
	//			scenecolor.b = 1.0;
	//		}
	//	}
 
		return scenecolor;
}

technique YACA
{
	pass YACApushLastLine
	{
		VertexShader = PostProcessVS;
		PixelShader = PS_YACApushLastLine;
		RenderTarget = texYACA2;
	}
	
	pass YACA
	{
		VertexShader = PostProcessVS;
		PixelShader = PS_YACA;
	}
}
