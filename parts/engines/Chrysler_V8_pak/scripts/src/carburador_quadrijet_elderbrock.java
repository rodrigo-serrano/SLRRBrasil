package java.game.parts.engines;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_quadrijet_elderbrock extends FuelInjectorSystem
{
	public carburador_quadrijet_elderbrock( int id )
	{
		super( id );
		name = "Carburador Quadrijet Edelbrock";
		description = "";
		brand_new_prestige_value = 50.50;

		value = 1800;
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 14.7;
		max_fuel_consumption	= 0.06;
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
