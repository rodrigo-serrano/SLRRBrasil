package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Einvagen_PerPro_GTA_intake_camshaft extends DOHC_Camshaft
{
	public Einvagen_PerPro_GTA_intake_camshaft( int id )
	{
		super( id );
		name = "Volkswagen AT 1.0 16v intake camshaft";
		description = "";
		brand_new_prestige_value = 17.09;

		value = tHUF2USD(80);
		setMaxWear(kmToMaxWear(410000.0));

		static_input_lobe_separation	= 250.0;
		static_input_lift_in_open	= 13.5;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 220.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(4.0);

	}
}
