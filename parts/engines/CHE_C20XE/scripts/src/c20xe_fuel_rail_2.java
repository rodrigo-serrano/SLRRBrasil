package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class c20xe_fuel_rail_2 extends FuelInjectorSystem
{
	public c20xe_fuel_rail_2( int id )
	{
		super( id );
		name = "C20XE dual fuel rail for ITB";
		description = "";

		value = tHUF2USD(4*5+12);
		brand_new_prestige_value = 51.26;
		setMaxWear(kmToMaxWear(330000.0));

		max_fuel_consumption	= 0.0395;
		mixture_ratio		= 18.0;
		fuel_type		= FT_GAS_95;
		calcStuffs();

		check4warnings();
	}
}