package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class fuel_rail_4cyl extends FuelInjectorSystem
{
	public fuel_rail_4cyl( int id )
	{
		super( id );
		name = "Flauta De Combustivel Fiat V.I.S. 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 14.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
