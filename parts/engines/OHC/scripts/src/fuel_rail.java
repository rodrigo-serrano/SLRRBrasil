package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class fuel_rail extends FuelInjectorSystem
{
	public fuel_rail( int id )
	{
		super( id );
		name = "OHC carburetor";
		description = "";

		value = tHUF2USD(40.234);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(3800000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 14.0;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
