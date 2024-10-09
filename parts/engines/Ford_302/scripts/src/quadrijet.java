package java.game.parts.engines.Ford_302;

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
		name = "Carburador Ford 302 Quadrijet";
		description = "";

		brand_new_prestige_value = 30;

		value = 2200;
		setMaxWear(kmToMaxWear(31623.3));

		mixture_ratio		= 13.5;
		max_fuel_consumption	= 0.04;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();

	}
	public void updatevariables()
	{
		max_air_consumption	= 0.8;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(12)) && unsafePart instanceof AirFilter )
		{
			AirFilter air_intake = unsafePart;

			air_intake.updatevariables();

			max_air_consumption = air_intake.max_air_consumption;
		}

		super.updatevariables();
	}

}