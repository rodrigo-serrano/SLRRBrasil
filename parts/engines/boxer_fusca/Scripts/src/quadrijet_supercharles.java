package java.game.parts.engines.boxer_fusca;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class quadrijet_supercharles extends FuelInjectorSystem
{
	public quadrijet_supercharles( int id )
	{
		super( id );
		name = "Quadrijet Para Supercharger Motor Fusca";
		description = "";
		brand_new_prestige_value = 30;

		value = 3200;
		setMaxWear(kmToMaxWear(31623.3));

		mixture_ratio		= 13.0;
		max_fuel_consumption	= 3.5;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();

	}

	public void updatevariables()
	{
		max_air_consumption	= 3.5;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(11)) && unsafePart instanceof AirFilter )
		{
			AirFilter air_intake = unsafePart;

			air_intake.updatevariables();

			max_air_consumption = air_intake.max_air_consumption;
		}

		super.updatevariables();
	}

}