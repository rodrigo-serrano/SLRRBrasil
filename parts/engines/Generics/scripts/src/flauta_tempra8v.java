package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class flauta_tempra8v extends FuelInjectorSystem
{
	public flauta_tempra8v( int id )
	{
		super( id );
		name = "Flauta Combustivel Fiat Twin Cam 2.0 8v";
		description = "";

		value = 300;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.10;
		default_mixture_ratio	= 14.75;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
