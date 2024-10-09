package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class fuel_rail_12 extends FuelInjectorSystem
{
	public fuel_rail_12( int id )
	{
		super( id );
		name = "Flauta Combustivel AEM Honda Serie K";
		description = "";

		value = 300;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(226000.0));

		max_fuel_consumption	= 0.20;
		default_mixture_ratio	= 16.00;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
