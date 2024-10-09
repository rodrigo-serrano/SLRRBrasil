package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_esquerdo_admissao_original extends DOHC_Camshaft
{
	public comando_esquerdo_admissao_original( int id )
	{
		super( id );
		name = "Comando Admissao Esquerdo Motor V6";
		description = "";
		
		brand_new_prestige_value = 45.80;
		value = 500;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 17500.0;

		static_input_lobe_separation	= 250.0;
		static_input_lift_in_open	= 15.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 200.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}
