package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class carburetor_solex extends FuelInjectorSystem
{
	public carburetor_solex( int id )
	{
		super( id );
		name = "Carburador Solex Corpo Simples";
		description = "Stock carburetor for EA-827 engines.";

		value = 100;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.015;
		default_mixture_ratio	= 13.0;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
