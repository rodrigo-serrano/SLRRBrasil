package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Duhen_DVC_exhaust_camshaft extends DOHC_Camshaft
{
	public Duhen_DVC_exhaust_camshaft( int id )
	{
		super( id );

		value = tHUF2USD(70);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(410000.0));

		static_input_lobe_separation	= 218.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 14.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 244.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		name = "Duratec HE/CHT 1.6 Exhaust camshaft";
		description = "";

		maxRPM = 12000.0;
		inertia = kgToInertia(4.0);
	}
}
