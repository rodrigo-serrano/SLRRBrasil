package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_adm_civic18 extends DOHC_Camshaft
{
	public comando_adm_civic18( int id )
	{
		super( id );
		name = "Comando de Admissao Honda 1.8 16v R18";
		description = "";

		value = 400;
		brand_new_prestige_value = 140.51;
		setMaxWear(kmToMaxWear(390000.0));

		static_input_lobe_separation	= 215.0;
		static_input_lift_in_open	= 13.95;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 240.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 20000.0;
		inertia = kgToInertia(0.5);

		check4warnings();
	}
}
