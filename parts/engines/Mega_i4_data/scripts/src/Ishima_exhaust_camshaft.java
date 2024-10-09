package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Ishima_exhaust_camshaft extends DOHC_Camshaft
{
	public Ishima_exhaust_camshaft( int id )
	{
		super( id );
		name = "E.Torq Exhaust camshaft";
		description = "";
		brand_new_prestige_value = 17.09;

		value = tHUF2USD(80);
		setMaxWear(kmToMaxWear(410000.0));

		static_input_lobe_separation	= 211.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.5;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 244.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(4.0);
	}
}
