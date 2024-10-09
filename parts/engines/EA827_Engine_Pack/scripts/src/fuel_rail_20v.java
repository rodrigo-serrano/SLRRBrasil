package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class fuel_rail_20v extends FuelInjectorSystem
{
	public fuel_rail_20v( int id )
	{
		super( id );
		name = "Flauta De Combustivel Volkswagen AP 20v";
		description = "";

		value = 300;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.09;
		default_mixture_ratio	= 14.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
