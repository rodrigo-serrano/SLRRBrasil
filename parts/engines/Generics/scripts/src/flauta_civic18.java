package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class flauta_civic18 extends FuelInjectorSystem
{
	public flauta_civic18( int id )
	{
		super( id );
		name = "Flauta Combustivel Honda 1.8 16v R18";
		description = "";

		value = 320;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 13.0;
		default_fuel_type	= FT_GAS_98;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
