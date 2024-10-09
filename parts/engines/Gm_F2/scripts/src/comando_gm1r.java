package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_gm1r extends SOHC_Camshaft
{
	public comando_gm1r( int id )
	{
		super( id );
		name = "Comando Carlini GM 1R GM F2 8v";
		description = "";

		brand_new_prestige_value = 20;
		value = 1800;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 20000.0/2.0;

		static_input_lobe_separation	= 112+112;
		static_input_lift_in_open	= 13.00;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.00;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 258.0;
		static_input_time_out_duration	= 262.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}