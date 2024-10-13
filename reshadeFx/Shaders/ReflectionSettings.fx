//texture env_map1 < source = "env_maps\\env_map_1.png"; > { Width = 256; Height = 256; Format = RGBA8; };
//texture env_map2 < source = "env_maps\\env_map_2.png"; > { Width = 512; Height = 512; Format = RGBA8; };
//texture env_map3 < source = "env_maps\\env_map_3.png"; > { Width = 512; Height = 512; Format = RGBA8; };
//texture env_map4 < source = "env_maps\\env_map_4.png"; > { Width = 256; Height = 256; Format = RGBA8; };
//texture env_map5 < source = "env_maps\\env_map_5.png"; > { Width = 128; Height = 128; Format = RGBA8; };
//texture env_map6 < source = "env_maps\\env_map_6.png"; > { Width = 256; Height = 256; Format = RGBA8; };
//texture env_map7 < source = "env_maps\\env_map_7.png"; > { Width = 512; Height = 512; Format = RGBA8; };
//texture env_map8 < source = "env_maps\\env_map_8.png"; > { Width = 256; Height = 256; Format = RGBA8; };
//texture env_map9 < source = "env_maps\\env_map_9.png"; > { Width = 256; Height = 256; Format = RGBA8; };
//texture env_map10 < source = "env_maps\\env_map_10.png"; > { Width = 512; Height = 512; Format = RGBA8; };
//
//sampler env_map1_sampler { Texture = env_map1; };
//sampler env_map2_sampler { Texture = env_map2; };
//sampler env_map3_sampler { Texture = env_map3; };
//sampler env_map4_sampler { Texture = env_map4; };
//sampler env_map5_sampler { Texture = env_map5; };
//sampler env_map6_sampler { Texture = env_map6; };
//sampler env_map7_sampler { Texture = env_map7; };
//sampler env_map8_sampler { Texture = env_map8; };
//sampler env_map9_sampler { Texture = env_map9; };
//sampler env_map10_sampler { Texture = env_map10; };


uniform float DynamicReflection <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Weather the backbuffer is used for reflections, 0 = neutral";
	ui_step = 1.00;
> = 1.0;

uniform float DynamicReflection_HaltAfterFirstReflectingSurface <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Weather the backbuffer is used for reflections, 0 = neutral";
	ui_step = 1.00;
> = 1.0;

uniform float DynamicReflection_DownsampleFactor <
	ui_type = "drag";
	ui_min = 1.0; ui_max = 100.0;
	ui_tooltip = "Blur amount on the environment map, 1 = neutral";
	ui_step = 0.01;
> = 1.0;

//uniform float ForceNonDynamicReflectionIndex <
//	ui_type = "drag";
//	ui_min = 0.0; ui_max = 10.0;
//	ui_tooltip = "If 0 Dynamic reflection will render can be 1..10 to overwrite the environment map of everything\n1 will be the file reshadeFx/env_maps/env_map_1 and so on\nif you want to change these textures dont forget to update their resolution and/or Format in the ReflectionSettings.fx";
//	ui_step = 0.1;
//> = 0.0;

uniform float ReflectionStrengthOverride <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "ReflectionStrengthOverride, 0 = neutral";
	ui_step = 1.00;
> = 1.0;

uniform float SpecularOverrideEnabled <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "SpecularOverrideEnabled, 0 = neutral";
	ui_step = 1.00;
> = 1.0;
uniform float SpecularColorPower <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 50.0;
	ui_tooltip = "SpecularColorPower, 1 = neutral";
	ui_step = 0.1;
> = 1.0;
uniform float SpecularPower <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 500.0;
	ui_tooltip = "SpecularPower, 50 = neutral";
	ui_step = 1.0;
> = 50.0;

uniform float ReflectionTexCoordOverrideType <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4.0;
	ui_tooltip = "TextCoord precalc mode override(this is fixed pipeline d3d9....), 0 = neutral";
	ui_step = 1.00;
> = 1.0;

uniform float Reflection_A <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "A ReflectionColorCorrection";
	ui_step = 0.01;
> = 1.0;
uniform float Reflection_R <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "R ReflectionColorCorrection";
	ui_step = 0.01;
> = 1.0;
uniform float Reflection_G <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "G ReflectionColorCorrection";
	ui_step = 0.01;
> = 1.0;
uniform float Reflection_B <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "B ReflectionColorCorrection";
	ui_step = 0.01;
> = 1.0;

uniform float SoftwareFrustrumCullReturnOverwrite <
	ui_type = "drag";
	ui_min = 0; ui_max = 8;
	ui_tooltip = "If this is 1 than the objects behind the camera will be unloaded\n(that is the default SLRR method)\nthis is very slow so to disable set it to 4";
	ui_step = 0.01;
> = 4.0;
uniform float CarDeformationOnCollisionMult <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 5.0;
	ui_tooltip = "Default is 1.0 if its < 1.0 than car will bend less on a collision";
	ui_step = 0.01;
> = 1.0;
uniform float CarChassisDeformationOnCollisionMult <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 5.0;
	ui_tooltip = "Default is 1.0 if its < 1.0 than the car-slots(wheels) will bend less";
	ui_step = 0.01;
> = 1.0;
uniform float CarPartDetachmentMult <
	ui_type = "drag";
	ui_min = -0.01; ui_max = 5.0;
	ui_tooltip = "Default is 1.0 if its < 1.0 than parts would need to be damaged more to be detached";
	ui_step = 0.01;
> = 1.0;
uniform float DisableFlop <
	ui_type = "drag";
	ui_min = 0; ui_max = 1.0;
	ui_tooltip = "Disables doors opening on collision (if == 0 doors won't open)";
	ui_step = 1.0;
> = 1.0;
uniform float WearMultEngine <
	ui_type = "drag";
	ui_min = 0; ui_max = 100.0;
	ui_tooltip = "Scales(0.0-100.0) the wear of parts by use\n(overdriving the engine wears it down faster this can be compensated here)";
	ui_step = 1.0;
> = 1.0;
uniform float WearMultTyre <
	ui_type = "drag";
	ui_min = 0; ui_max = 1.0;
	ui_tooltip = "Scales(0.0-1.0) the wear of parts by use (tyre wear can be compensated here)";
	ui_step = 0.01;
> = 1.0;
uniform float TrafficFlatBonus <
	ui_type = "drag";
	ui_min = -10.0; ui_max = 10.0;
	ui_tooltip = "Flat added to the height of every traffic car";
	ui_step = 0.01;
> = -0.13;
uniform float TrafficDummyRacerWheelSizeLimit <
	ui_type = "drag";
	ui_min = -3.0; ui_max = 3.0;
	ui_tooltip = "THIS IS CURRENTLY UNUSED\nRacers have larger bounding sphere around their wheels\n so that the phys engine can process the extra large wheels\npresent on the Bigfoots\nthis bounding sphere is used to determine the size of the dummy wheel\nthat is put on the racer cars when they are in traffic\nadjustments are needed this is the limit with which I differenciate betwwen regular traffic cars and racer traffic cars";
	ui_step = 0.01;
> = 0.7;
uniform float TrafficFlatValueForLimitedWheelSizes <
	ui_type = "drag";
	ui_min = -3.0; ui_max = 3.0;
	ui_tooltip = "THIS IS CURRENTLY UNUSED\nIf traffic car wheel is > TrafficDummyRacerWheelSizeLimit than traffic car wheel.size = TrafficFlatValueForLimitedWheelSizes";
	ui_step = 0.01;
> = -0.35;
uniform float AISlideIgnoreMod <
	ui_type = "drag";
	ui_min = 0; ui_max = 5000;
	ui_tooltip = "The higher the more AI cars do not care for sliding\n(the AI had problem accelerating on sideways slopes\nbecause it thought the car was powersliding and\ndetermined the best course of action to let go of the throttle)\n default is 127, 472 should be acceptable";
	ui_step = 1.0;
> = 472;
uniform float AIOverBreaking <
	ui_type = "drag";
	ui_min = 0; ui_max = 10;
	ui_tooltip = "AIOverBreaking";
	ui_step = 0.01;
> = 4.0;
uniform float AIOverSteering <
	ui_type = "drag";
	ui_min = 0; ui_max = 10;
	ui_tooltip = "AI oversteering";
	ui_step = 0.01;
> = 1.1;
uniform float AIOverThrotlling <
	ui_type = "drag";
	ui_min = 0; ui_max = 10;
	ui_tooltip = "AIOverThrotlling";
	ui_step = 0.01;
> = 1.5;
uniform float MXAOBehindSmoke <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Render MXAO before rendering any smoke";
	ui_step = 1.0;
> = 1.0;
uniform float DisableRenderRefCleanUp <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Disable Render Ref(car) unloading during races\n(if == 1 than unloading is disabled during races)";
	ui_step = 1.0;
> = 1.0;

uniform float cfg_deformation <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 10.0;
	ui_tooltip = "Overall deformation on a collision if zero car is invincible";
	ui_step = 0.01;
> = 1.040650;
uniform float cfg_engine_inertia_factor <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 100.0;
	ui_tooltip = "Global engine power default is 6.0 should not touch";
	ui_step = 1.0;
> = 6.000000;
uniform float cfg_external_damage <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 10.0;
	ui_step = 0.01;
> = 0.2500000;
uniform float cfg_internal_damage <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 10.0;
	ui_step = 0.01;
> = 1.040650;
uniform float cfg_mem_instance_current <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Number of script instances or render ref instances\nif this is too high game gets laggy\nbecause of the overwhelming amount of items\nit needs to manage in the game world\nif its too low things disappear.";
	ui_step = 1.0;
> = 1.0;
uniform float cfg_mem_instance_max <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 50000.0;
	ui_step = 10.0;
> = 5500.0;
uniform float cfg_mem_instance_min <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 50000.0;
	ui_step = 10.0;
> = 4000.0;
uniform float cfg_mem_sound_max <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 66.0;
uniform float cfg_mem_sound_min <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 12.0;
uniform float cfg_mem_texture_current <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "Memory reserved currently for textures\nif the max limit is reached textures get unloaded\nthis is not good you want textures of current stuff(cars, map) loaded\nbecause the game loads it again from disk if you look at it\nadn it got unloaded before\nand that takes far too much time to maintian a playable fps";
	ui_step = 1.0;
> = 1.0;
uniform float cfg_mem_texture_max <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 80.0;
uniform float cfg_mem_texture_min <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 40.0;
uniform float cfg_mem_vertex_current <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_tooltip = "Memory reserved currently for vertex data\nif the max limit is reached vertex data gets unloaded\nthis is not good you want vertices of current stuff(cars, map) loaded\nbecause the game loads it again from disk if you look at it\nadn it got unloaded before\nand that takes far too much time to maintian a playable fps";
	ui_step = 1.0;
> = 1.0;
uniform float cfg_mem_vertex_max <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 80.0;
uniform float cfg_mem_vertex_min <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 4000.0;
	ui_step = 1.0;
> = 16.0;
uniform float cfg_particle_density <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 10.0;
	ui_step = 0.01;
> = 2.0;
uniform float cfg_skidmarks_max <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 50000.0;
	ui_step = 1.0;
> = 8200.0;
uniform float resource_loadrate <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 100.0;
	ui_tooltip = "The limit on load operations that can be done in a single frame\nif this is high everything that is needed gets loaded before render\nbut ofcourse that takes time this means lower fps\nbut if this is too low things might not get loaded and will be missing\nthis can include parts of the current map your car anything\n(sounds even)";
	ui_step = 1.0;
> = 15.0;
uniform float ClutchOnInAutoShiftDeadTime <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "This is the amount the clutch is pressed right after a gear shift occures (if this is 0 the car will not hit the rev limiter on shift)";
	ui_step = 0.01;
> = 0.5;
uniform float ThrottleOnInAutoShiftDeadTime <
	ui_type = "drag";
	ui_min = 0.0; ui_max = 1.0;
	ui_tooltip = "This is the amount the thorttle is pressed right after a gear shift occures (if this is 1 the car will accelerate right after shift there is no transition)";
	ui_step = 0.01;
> = 0.5;


#include "Reshade.fxh"

float3 NullTechniquePS(float4 vpos : SV_Position, float2 texcoord : TEXCOORD) : SV_Target
{
	//float3 color;
	//color = tex2D(env_map1_sampler, texcoord).rgb;
	//color = tex2D(env_map2_sampler, texcoord).rgb;
	//color = tex2D(env_map3_sampler, texcoord).rgb;
	//color = tex2D(env_map4_sampler, texcoord).rgb;
	//color = tex2D(env_map5_sampler, texcoord).rgb;
	//color = tex2D(env_map6_sampler, texcoord).rgb;
	//color = tex2D(env_map7_sampler, texcoord).rgb;
	//color = tex2D(env_map8_sampler, texcoord).rgb;
	//color = tex2D(env_map9_sampler, texcoord).rgb;
	//color = tex2D(env_map10_sampler, texcoord).rgb;
	return tex2D(ReShade::BackBuffer, texcoord).rgb;
}

technique NullTechnique
{
	pass
	{
		VertexShader = PostProcessVS;
		PixelShader  = NullTechniquePS;
	}
}
