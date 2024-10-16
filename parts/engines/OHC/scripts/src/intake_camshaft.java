package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class intake_camshaft extends SOHC_Camshaft
{
	public intake_camshaft( int id )
	{
		super( id );
		name = "OHC Valves commander camshaft";
		description = "";

		value = tHUF2USD(60.586);
		brand_new_prestige_value = 140.51;
		setMaxWear(kmToMaxWear(3900000.0));

		static_input_lobe_separation	= 223.0;
		static_input_lift_in_open	= 14.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 14.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 234.0;
		static_input_time_out_duration	= 244.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 20000.0;
		inertia = kgToInertia(3.3);

		check4warnings();
	}
}
