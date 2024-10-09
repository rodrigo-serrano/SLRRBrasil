package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_f270 extends SOHC_Camshaft
{
	public comando_f270( int id )
	{
		super( id );
		name = "Comando F270 307x103";
		description = "";

		brand_new_prestige_value = 20;
		value = 1200;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 20000.0/2.0;

		static_input_lobe_separation	= 103+103;
		static_input_lift_in_open	= 14.00;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 14.00;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 270.0;
		static_input_time_out_duration	= 307.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}