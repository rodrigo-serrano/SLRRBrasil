package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class vr_6_2_9_fuel_rail extends FuelInjectorSystem
{
	public vr_6_2_9_fuel_rail( int id )
	{
		super( id );
		name = "Flauta De Combustivel VW VR6 2.9";
		description = " ";

		value = tHUF2USD(6*22+35);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 14.0;
		default_fuel_type	= FT_GAS_100;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 29 );
		if (!p)
			return "O Motor esta sem Linha De Combustivel.";

		return super.isDynoable();
	}
}