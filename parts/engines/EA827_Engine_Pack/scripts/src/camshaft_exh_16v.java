package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class camshaft_exh_16v extends DOHC_Camshaft
{
	public camshaft_exh_16v( int id )
	{
		super( id );
		name = "Comando Original De Escape Volkswagen AP 16v";
		description = "";

		value = 400;
		brand_new_prestige_value = 140.51;
		setMaxWear(kmToMaxWear(390000.0));

		static_input_lobe_separation	= 212.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.5;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 240.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 20000.0;
		inertia = kgToInertia(0.5);

		check4warnings();
	}
}
