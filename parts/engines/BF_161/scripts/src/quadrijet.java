package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class quadrijet extends FuelInjectorSystem
{
	public quadrijet( int id )
	{
		super( id );
		name = "Holley Quadrijet Para Willys BF-161";
		description = "";
		brand_new_prestige_value = 70.70;

		value = 1800;
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 13.0;
		max_fuel_consumption	= 0.8;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();
	}
}