package java.game.parts.engines;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_bijet extends FuelInjectorSystem
{
	public carburador_bijet( int id )
	{
		super( id );
		name = "Carburador Bijet Original Dodge 318";
		description = "";
		brand_new_prestige_value = 25.25;

		value = tHUF2USD(124.85);
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 14.7;
		max_fuel_consumption	= 0.03;
		fuel_type		= FT_GAS_95;
		calcStuffs();

		check4warnings();
	}

	public int isTuneable()
	{
		return 1;

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
