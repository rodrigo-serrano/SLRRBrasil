package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class comando_crower308 extends OHV_Camshaft
{
	public comando_crower308( int id )
	{
		super( id );
		name = "Comando Crower 308x316 108° Chevrolet 250";
		description = "";

		brand_new_prestige_value = 20.00;
		value = 4000;
		setMaxWear(kmToMaxWear(390000.0));

		maxRPM = 20000.0/2.0;

		static_input_lobe_separation	= 108+108;
		static_input_lift_in_open	= 13.25;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.25;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 300.0;
		static_input_time_out_duration	= 316.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		inertia = kgToInertia(4.0);

		check4warnings();
	}
}