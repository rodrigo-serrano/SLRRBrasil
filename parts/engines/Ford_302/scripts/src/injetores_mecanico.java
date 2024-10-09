package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class injetores_mecanico extends FuelInjectorSystem
{
	public injetores_mecanico( int id )
	{
		super( id );
		name = "Injetores Mecanico Ford 302";
		description = "";

		value = 1800;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		mixture_ratio		= 13.5;
		max_fuel_consumption	= 0.25;
		fuel_type		= FT_GAS_98;
		calcStuffs();

		check4warnings();

	}

	public void updatevariables()
	{
		max_air_consumption	= 2.00;

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
