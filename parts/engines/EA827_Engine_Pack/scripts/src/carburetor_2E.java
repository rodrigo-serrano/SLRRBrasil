package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class carburetor_2E extends FuelInjectorSystem
{
	public carburetor_2E( int id )
	{
		super( id );
		name = "Carburador Brosol 2e Volkswagen AP";
		description = "Stock carburetor for Volkswagen EA-827 engines.";

		value = 250;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.03;
		default_mixture_ratio	= 13.0;
		default_fuel_type	= FT_GAS_98;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
