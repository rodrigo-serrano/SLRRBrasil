package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class duplo_quadrijet extends FuelInjectorSystem
{
	public duplo_quadrijet( int id )
	{
		super( id );
		name = "Dupla Carburacao Ford 302 Quadrijet";
		description = "";

		brand_new_prestige_value = 30;

		value = 650;
		setMaxWear(kmToMaxWear(31623.3));

		mixture_ratio		= 13.5;
		max_fuel_consumption	= 2.0;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();

	}

	public void updatevariables()
	{
		max_air_consumption	= 3.5;

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