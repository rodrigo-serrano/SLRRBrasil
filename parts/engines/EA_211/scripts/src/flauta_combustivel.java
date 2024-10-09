package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class flauta_combustivel extends FuelInjectorSystem
{
	public flauta_combustivel( int id )
	{
		super( id );
		name = "Injetores EA-211 3 Cilindros";
		description = "";

		value = 350;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.05;
		default_mixture_ratio	= 13.00;
		default_fuel_type	= FT_GAS_98;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
