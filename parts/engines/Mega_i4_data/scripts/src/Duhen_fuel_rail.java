package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Duhen_fuel_rail extends FuelInjectorSystem
{
	public Duhen_fuel_rail( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT fuel rail";
		description = "";

		value = tHUF2USD(4*5+12);
		brand_new_prestige_value = 33.53;
		setMaxWear(kmToMaxWear(330000.0));

		max_fuel_consumption	= 0.025;
		default_mixture_ratio	= 13.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
