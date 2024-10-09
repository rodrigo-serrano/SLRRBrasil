package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Disel_fuel_rail extends FuelInjectorSystem
{
	public Disel_fuel_rail( int id )
	{
		super( id );
		name = "Cummins ISBe4 fuel rail";
		description = "";

		value = tHUF2USD(4*5+50);
		brand_new_prestige_value = 41.53;
		setMaxWear(kmToMaxWear(33000000.0));

		max_fuel_consumption	= 0.025;
		default_mixture_ratio	= 12.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
