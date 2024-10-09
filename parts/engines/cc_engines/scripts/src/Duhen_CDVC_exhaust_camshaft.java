package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Duhen_CDVC_exhaust_camshaft extends DOHC_Camshaft
{
	public Duhen_CDVC_exhaust_camshaft( int id )
	{
		super( id );

		value = tHUF2USD(95);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(410000.0));

		static_input_lobe_separation	= 262.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 14.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 254.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		name = "Endura-E 1.3 Exhaust camshaft";
		description = "This is the stock exhaust camshaft of the racing model, the 2.0 CDVC. \n It "+advanceCapabsToText()+". Can only be used in DOHC heads. Weighs "+massToText(3.0)+". \n Parameters: gross lift is "+liftToText(static_input_lift_out_open)+", duration is "+degToText(static_input_time_out_duration)+".";

		maxRPM = 20000.0;
		inertia = kgToInertia(3.0);
	}
}
