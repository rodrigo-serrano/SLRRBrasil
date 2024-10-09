package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_sportsystem_284 extends OHV_Camshaft
{
	public comando_sportsystem_284( int id )
	{
		super( id );
		name = "Comando Sportsystem 284 Motor Fusca";
		description = "";

		brand_new_prestige_value = 20;
		value = 700;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 20000.0/2.0;

		static_input_lobe_separation	= 107+107;
		static_input_lift_in_open	= 17.50;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 17.50;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 230.0;
		static_input_time_out_duration	= 284.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}