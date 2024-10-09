package java.game.parts.engines;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_quadrijet_demon extends FuelInjectorSystem
{
	public carburador_quadrijet_demon( int id )
	{
		super( id );
		name = "Carburador Quadrijet Demon";
		description = "";
		brand_new_prestige_value = 70.70;

		value = tHUF2USD(297.35);
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 13.0;
		max_fuel_consumption	= 0.10;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();
	}

	public int isTuneable()
	{
		return 1;

	}


	public void updatevariables()
	{
		max_air_consumption	= 1.5;

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
