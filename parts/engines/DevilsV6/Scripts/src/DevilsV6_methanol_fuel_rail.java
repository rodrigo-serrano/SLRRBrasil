package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class DevilsV6_methanol_fuel_rail extends FuelInjectorSystem
{
	public DevilsV6_methanol_fuel_rail( int id )
	{
		super( id );
		name = "Flauta Combustivel Racing Motor V6";
		description = "";

		value = 3000;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.10;
		default_mixture_ratio	= 9.0;
		default_fuel_type	= FT_GAS_100;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}

	public void updatevariables()
	{
		max_air_consumption	= 1.0;

		/*Part unsafePart;
		if ( (unsafePart = partOnSlot(11)) && unsafePart instanceof AirFilter )
		{
			AirFilter air_intake = unsafePart;

			air_intake.updatevariables();

			max_air_consumption = air_intake.max_air_consumption;
		} */

		super.updatevariables();
	}
}
