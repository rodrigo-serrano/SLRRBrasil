package java.game.parts.engines.Boxer4;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class methanol_fuel_rail extends FuelInjectorSystem
{
	public methanol_fuel_rail( int id )
	{
		super( id );
		name = "Flauta E Bicos 220lb/h Subaru EJ";
		description = "";
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(226000.0));

		mixture_ratio		= 14.25;
		max_fuel_consumption	= 0.00;
		fuel_type		= FT_METHANOL;
		calcStuffs();

		check4warnings();
	}

	public void updatevariables()
	{
		max_air_consumption	= 0.6;

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