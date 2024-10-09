package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_f1_gm2 extends SOHC_Camshaft
{
	public comando_f1_gm2( int id )
	{
		super( id );
		name = "Comando Carlini Familia 1 GM2";
		description = "";

		brand_new_prestige_value = 20;
		value = 1900;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 20000.0/2.0;

		static_input_lobe_separation	= 112+112;
		static_input_lift_in_open	= 13.95;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.85;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 268.0;
		static_input_time_out_duration	= 290.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}