package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class DevilsV6_Performance_intake_manifold extends IntakeManifold
{
	public DevilsV6_Performance_intake_manifold( int id )
	{
		super( id );
		name = "Coletor Admissao ITB Motor V6";
		description = "";
		brand_new_prestige_value = 86.01;

		value = 7000;
		setMaxWear(kmToMaxWear(400000.0));

		fuel_rail_slot_ID=7;

		efficiency = 1.5;

		check4warnings();
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 1.5;
		mixture_H = 1.0;
		time_burn = 0.1;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(7)) && unsafePart instanceof AirFuelDeliverySystem)
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
