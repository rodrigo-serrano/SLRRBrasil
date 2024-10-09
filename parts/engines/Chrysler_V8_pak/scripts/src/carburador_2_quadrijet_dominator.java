package java.game.parts.engines;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class carburador_2_quadrijet_dominator extends FuelInjectorSystem
{
	public carburador_2_quadrijet_dominator( int id )
	{
		super( id );
		name = "Dupla Quadrijet Holley Dominator";
		description = "";
		brand_new_prestige_value = 90.90;

		value = 4000;
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 13.0;
		max_fuel_consumption	= 0.15;
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
		max_air_consumption	= 2.0;

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
