package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class intake_camshaft_10 extends DOHC_Camshaft
{
	public intake_camshaft_10( int id )
	{
		super( id );
		name = "Comando de admissao motor CHT 1.0";
		description = "";

		value = tHUF2USD(12.586);
		brand_new_prestige_value = 140.51;
		setMaxWear(kmToMaxWear(390000.0));

		static_input_lobe_separation	= 213.0;
		static_input_lift_in_open	= 15.5;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 235.0;
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
