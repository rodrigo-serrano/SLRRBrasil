package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class SuperDuty_R_exhaust_camshaft extends DOHC_Camshaft
{
	public SuperDuty_R_exhaust_camshaft( int id )
	{
		super( id );
		name = "Comando De Escapamento Direito Subaru EJ25";
		description = "";
		brand_new_prestige_value = 45.80;

		value = 280;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 25000.0/2.0;

		static_input_lobe_separation	= 235.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 14.462;
		static_input_lift_out_close	= 1.27;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 244.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(2.5);

		
		check4warnings();

	}
}
