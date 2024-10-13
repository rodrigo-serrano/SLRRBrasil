// CRT shader
// 
// Copyright (C) 2010-2012 cgwg, Themaister and DOLLS
// 
// This program is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License as published by the Free
// Software Foundation; either version 2 of the License, or (at your option)
// any later version.

// Comment the next line to disable interpolation in linear gamma (and gain speed).
//#define LINEAR_PROCESSING

uniform float CRTResolution <
	ui_type = "drag";
	ui_min = 1.0; ui_max = 8.0;
	ui_tooltip = "Input size coefficient (low values gives the 'low - res retro look').";
> = 1.15;
#ifndef LINEAR_PROCESSING
uniform float CRTgamma <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4.0;
	ui_tooltip = "Gamma of simulated CRT";
> = 2.4;
#endif
uniform float CRTmonitorgamma <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4.0;
	ui_tooltip = "Gamma of display monitor";
> = 2.2;
uniform float CRTBrightness <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 3.0;
	ui_tooltip = "Used to boost brightness a little.";
> = 0.9;

uniform int CRTScanlineIntensity <
	ui_type = "drag";
	ui_min = 2; ui_max = 4;
	ui_tooltip = "Scanlines intensity";
> = 2;
uniform bool CRTScanlineGaussian <
	ui_tooltip = "Use the new nongaussian scanlines bloom effect.";
> = true;
uniform bool CRTCurvature <
	ui_tooltip = "Barrel effect";
> = false;
uniform float CRTCurvatureRadius <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 2.0;
	ui_tooltip = "Curvature Radius (only effective when Curvature is enabled).";
> = 1.5;
uniform float CRTCornerSize <
	ui_type = "drag";
	ui_min = 0.00; ui_max = 0.02; ui_step = 0.001;
	ui_tooltip = "Higher values => more rounded corner.";
> = 0.0100;
uniform float CRTDistance <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4.0;
	ui_tooltip = "Simulated distance from viewer to monitor.";
> = 2.00;
uniform float2 CRTAngle <
	ui_type = "drag";
	ui_min = -0.2; ui_max = 0.2;
	ui_tooltip = "Tilt angle in radians.";
> = 0.00;
uniform float CRTOverScan <
	ui_type = "drag";
	ui_min = 1.0; ui_max = 1.10; ui_step = 0.01;
	ui_tooltip = "Overscan (e.g. 1.02 for 2% overscan).";
> = 1.01;
uniform bool CRTOversample <
	ui_tooltip = "Enable 3x oversampling of the beam profile (warning : performance hit)";
> = true;

#include "ReShade.fxh"

// CeeJay_aspect ratio
#define CeeJay_aspect float2(1.0, 0.75)

// A bunch of useful values we'll need in the fragment shader.
#define sinangle sin(CRTAngle)
#define cosangle cos(CRTAngle)
#define stretch maxscale()

// Macros.
#define FIX(c) max(abs(c), 1e-5);

#ifndef PI
  #define PI 3.1415927
#endif

// The size of one texel, in texture-coordinates.
#define coone 1.0 / rubyTextureSize

#define mod_factor tex.x * rubyTextureSize.x * rubyOutputSize.x / rubyInputSize.x

#ifdef LINEAR_PROCESSING
	#define TEX2D(c) pow(tex2D(ReShade::BackBuffer, (c)), CRTgamma)
#else
	#define TEX2D(c) tex2D(ReShade::BackBuffer, (c))
#endif

float intersect(float2 xy)
{
	float A = dot(xy,xy) + (CRTDistance * CRTDistance);
	float B = 2.0 * (CRTCurvatureRadius * (dot(xy, sinangle) - CRTDistance * cosangle.x * cosangle.y) - CRTDistance * CRTDistance);
	float C = CRTDistance * CRTDistance + 2.0 * CRTCurvatureRadius * CRTDistance * cosangle.x * cosangle.y; //all constants
	return (-B - sqrt(B * B -4.0 * A * C)) / (2.0 * A);
}

float2 bkwtrans(float2 xy)
{
	float c = intersect(xy);
	float2 _point = float2(c, c) * xy;
	_point -= float2(-CRTCurvatureRadius, -CRTCurvatureRadius) * sinangle;
	_point /= float2(CRTCurvatureRadius, CRTCurvatureRadius);
	float2 tang = sinangle / cosangle;
	float2 poc = _point / cosangle;
	float A = dot(tang, tang) + 1.0;
	float B = -2.0 * dot(poc, tang);
	float C = dot(poc, poc) - 1.0;
	float a = (-B + sqrt(B * B -4.0 * A * C)) / (2.0 * A);
	float2 uv = (_point - a * sinangle) / cosangle;
	float r = CRTCurvatureRadius * acos(a);
	return uv * r / sin(r / CRTCurvatureRadius);
}
float2 fwtrans(float2 uv)
{
	float r = FIX(sqrt(dot(uv, uv)));
	uv *= sin(r / CRTCurvatureRadius) / r;
	float x = 1.0 - cos(r / CRTCurvatureRadius);
	float D = CRTDistance / CRTCurvatureRadius + x * cosangle.x * cosangle.y + dot(uv, sinangle);
	return CRTDistance * (uv * cosangle - x * sinangle) / D;
}

float3 maxscale()
{
	float2 c = bkwtrans(-CRTCurvatureRadius * sinangle / (1.0 + CRTCurvatureRadius / CRTDistance * cosangle.x * cosangle.y));
	float2 a = float2(0.5, 0.5) * CeeJay_aspect;
	float2 lo = float2(fwtrans(float2(-a.x, c.y)).x, fwtrans(float2(c.x,-a.y)).y) / CeeJay_aspect;
	float2 hi = float2(fwtrans(float2(+a.x, c.y)).x, fwtrans(float2(c.x, +a.y)).y) / CeeJay_aspect;
	return float3((hi + lo) * CeeJay_aspect * 0.5, max(hi.x - lo.x, hi.y - lo.y));
}

float2 transform(float2 coord, float2 textureSize, float2 inputSize)
{
	coord *= textureSize / inputSize;
	coord = (coord - 0.5) * CeeJay_aspect * stretch.z + stretch.xy;
	return (bkwtrans(coord) / float2(CRTOverScan, CRTOverScan) / CeeJay_aspect + 0.5) * inputSize / textureSize;
}

float corner(float2 coord, float2 textureSize, float2 inputSize)
{
	coord *= textureSize / inputSize;
	coord = (coord - 0.5) * float2(CRTOverScan, CRTOverScan) + 0.5;
	coord = min(coord, 1.0 - coord) * CeeJay_aspect;
	float2 cdist = float2(CRTCornerSize, CRTCornerSize);
	coord = (cdist - min(coord, cdist));
	float dist = sqrt(dot(coord, coord));
	return clamp((cdist.x-dist) * 1000.0, 0.0, 1.0);
}

// Calculate the influence of a scanline on the current pixel.
//
// 'distance' is the distance in texture coordinates from the current
// pixel to the scanline in question.
// 'color' is the colour of the scanline at the horizontal location of
// the current pixel.
float4 scanlineWeights(float distance, float4 color)
{
	// "wid" controls the width of the scanline beam, for each RGB channel
	// The "weights" lines basically specify the formula that gives
	// you the profile of the beam, i.e. the intensity as
	// a function of distance from the vertical center of the
	// scanline. In this case, it is gaussian if width=2, and
	// becomes nongaussian for larger widths. Ideally this should
	// be normalized so that the integral across the beam is
	// independent of its width. That is, for a narrower beam
	// "weights" should have a higher peak at the center of the
	// scanline than for a wider beam.
	if (!CRTScanlineGaussian)
	{
		float4 wid = 0.3 + 0.1 * pow(abs(color), 3.0);
		float4 weights = float4(distance / wid);
		return 0.4 * exp(-weights * weights) / wid;
	}
	else
	{
		float4 wid = 2.0 * pow(abs(color), 4.0) + 2.0;
		float calcdistance = distance / 0.3; // Optimization  ?
		//float4 weights = float4(distance / 0.3, distance / 0.3, distance / 0.3, distance / 0.3);
		float4 weights = float4(calcdistance, calcdistance, calcdistance, calcdistance);
		return 1.4 * exp(-pow(abs(weights * rsqrt(0.5 * wid)), abs(wid))) / (0.2 * wid + 0.6);
	}
}

float3 AdvancedCRTPass(float4 position : SV_Position, float2 tex : TEXCOORD0) : SV_Target
{
	// Here's a helpful diagram to keep in mind while trying to
	// understand the code:
	//
	//  |      |      |      |      |
	// -------------------------------
	//  |      |      |      |      |
	//  |  01  |  11  |  21  |  31  | <-- current scanline
	//  |      | @    |      |      |
	// -------------------------------
	//  |      |      |      |      |
	//  |  02  |  12  |  22  |  32  | <-- next scanline
	//  |      |      |      |      |
	// -------------------------------
	//  |      |      |      |      |
	//
	// Each character-cell represents a pixel on the output
	// surface, "@" represents the current pixel (always somewhere
	// in the bottom half of the current scan-line, or the top-half
	// of the next scanline). The grid of lines represents the
	// edges of the texels of the underlying texture.

	float  Input_ratio = ceil(256 * CRTResolution);
	float2 Resolution = float2(Input_ratio, Input_ratio);
	float2 rubyTextureSize = Resolution;
	float2 rubyInputSize = Resolution;
	float2 rubyOutputSize = ReShade::ScreenSize;

	float2 xy = CRTCurvature ? transform(tex, rubyTextureSize, rubyInputSize) : tex;
	float cval = corner(xy, rubyTextureSize, rubyInputSize);

	// Of all the pixels that are mapped onto the texel we are
	// currently rendering, which pixel are we currently rendering?
	float2 ratio_scale = xy * rubyTextureSize - 0.5;

	float filter = CRTOversample ? fwidth(ratio_scale.y) : 0;
	float2 uv_ratio = frac(ratio_scale);

	// Snap to the center of the underlying texel.
	xy = (floor(ratio_scale) + 0.5) / rubyTextureSize;

	// Calculate Lanczos scaling coefficients describing the effect
	// of various neighbour texels in a scanline on the current
	// pixel.
	float4 coeffs = PI * float4(1.0 + uv_ratio.x, uv_ratio.x, 1.0 - uv_ratio.x, 2.0 - uv_ratio.x);

	// Prevent division by zero.
	coeffs = FIX(coeffs);

	// Lanczos2 kernel.
	coeffs = 2.0 * sin(coeffs) * sin(coeffs / 2.0) / (coeffs * coeffs);

	// Normalize.
	coeffs /= dot(coeffs, 1.0);

	// Calculate the effective colour of the current and next
	// scanlines at the horizontal location of the current pixel,
	// using the Lanczos coefficients above.
	float4 col  = clamp(mul(coeffs, float4x4(
		TEX2D(xy + float2(-coone.x, 0.0)),
		TEX2D(xy),
		TEX2D(xy + float2(coone.x, 0.0)),
		TEX2D(xy + float2(2.0 * coone.x, 0.0)))),
		0.0, 1.0);
	float4 col2 = clamp(mul(coeffs, float4x4(
		TEX2D(xy + float2(-coone.x, coone.y)),
		TEX2D(xy + float2(0.0, coone.y)),
		TEX2D(xy + coone),
		TEX2D(xy + float2(2.0 * coone.x, coone.y)))),
		0.0, 1.0);

#ifndef LINEAR_PROCESSING
	col  = pow(abs(col) , CRTgamma);
	col2 = pow(abs(col2), CRTgamma);
#endif

	// Calculate the influence of the current and next scanlines on
	// the current pixel.
	float4 weights  = scanlineWeights(uv_ratio.y, col);
	float4 weights2 = scanlineWeights(1.0 - uv_ratio.y, col2);

	//if (CRTOversample)
	//{
		uv_ratio.y = uv_ratio.y + 1.0 / 3.0 * filter;
		float4 crt_weights = (weights + scanlineWeights(uv_ratio.y, col)) / 3.0;
		float4 crt_weights2 = (weights2 + scanlineWeights(abs(1.0 - uv_ratio.y), col2)) / 3.0;
		uv_ratio.y = uv_ratio.y - 2.0 / 3.0 * filter;
		crt_weights = crt_weights + scanlineWeights(abs(uv_ratio.y), col) / 3.0;
		crt_weights2 = crt_weights2 + scanlineWeights(abs(1.0 - uv_ratio.y), col2) / 3.0;
	//}
	if (CRTOversample)
	{
		weights = crt_weights;
		weights2 = crt_weights2;
	}

	float3 mul_res  = (col * weights + col2 * weights2).rgb * float3(cval, cval, cval);

	// dot-mask emulation:
	// Output pixels are alternately tinted green and magenta.
	float3 dotMaskWeights = lerp(float3(1.0, 0.7, 1.0), float3(0.7, 1.0, 0.7), floor(mod_factor % CRTScanlineIntensity));
	mul_res *= dotMaskWeights * float3(0.83, 0.83, 1.0) * CRTBrightness;

	// Convert the image gamma for display on our output device.
	mul_res = pow(abs(mul_res), 1.0 / CRTmonitorgamma);

	return mul_res;
}

technique AdvancedCRT
{
	pass
	{
		VertexShader = PostProcessVS;
		PixelShader = AdvancedCRTPass;
	}
}
