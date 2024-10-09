package java.game.parts.engines;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_fire extends FuelInjectorSystem
{
	public carburador_fire( int id )
	{
		super( id );
		name = "Carburador Quadrijet Engine Works";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 3000;
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 13.0;
		max_fuel_consumption	= 0.06;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();
	}

	public void updatevariables()
	{
		max_air_consumption	= 1.2;

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