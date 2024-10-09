package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class vr_6_2_8_exhaust_camshaft extends DOHC_Camshaft
{
	public vr_6_2_8_exhaust_camshaft( int id )
	{
		super( id );
		name = "Comando De Escape VW VR6 2.8";
		description = " ";

		value = tHUF2USD(51);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		static_input_lobe_separation	= 222.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 10.9;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 272.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 20000.0;
		inertia = kgToInertia(5.5);

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "O Comando De Escape esta sem Polia.";

		return super.isDynoable();
	}
}
