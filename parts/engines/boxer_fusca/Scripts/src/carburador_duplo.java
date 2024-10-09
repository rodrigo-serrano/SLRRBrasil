package java.game.parts.engines.boxer_fusca;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_duplo extends FuelInjectorSystem
{
	public carburador_duplo( int id )
	{
		super( id );
		name = "Carburador Duplo Motor Fusca";
		description = "";
		brand_new_prestige_value = 30;

		value = 900;
		setMaxWear(kmToMaxWear(31623.3));

		mixture_ratio		= 13.5;
		max_fuel_consumption	= 0.05;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();

	}

	public void updatevariables()
	{
		max_air_consumption	= 0.9;

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