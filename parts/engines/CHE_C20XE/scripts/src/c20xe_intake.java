package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class c20xe_intake extends IntakeManifold
{
	public c20xe_intake( int id )
	{
		super( id );
		name = "C20XE plenum";
		description = "";
		brand_new_prestige_value = 51.26;

		value = tHUF2USD(150);
		setMaxWear(kmToMaxWear(510000.0));

		fuel_rail_slot_ID=25;

		efficiency = 0.9;
	}

	public void updatevariables()
	{
		AirFuelDeliverySystem mixture_intake = partOnSlot(25);

		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 0.15;
		mixture_H = 1.0;
		time_burn = 0.1;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(25)) && unsafePart instanceof AirFuelDeliverySystem)
		{
			AirFuelDeliverySystem mixture_intake = unsafePart;

			mixture_intake.updatevariables();

			mixture_ratio = mixture_intake.mixture_ratio;
			max_fuel_consumption = mixture_intake.max_fuel_consumption;
			mixture_H = mixture_intake.mixture_H;
			time_burn = mixture_intake.time_burn;
		}
	}
}