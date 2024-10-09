package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class coletor_weber extends IntakeManifold
{
	public coletor_weber( int id )
	{
		super( id );
		name = "Coletor Dupla Webber Motor Fusca";
		description = "";
		brand_new_prestige_value = 25;

		value = 700;
		setMaxWear(kmToMaxWear(74000.0));

		fuel_rail_slot_ID=7;

		efficiency = 3.5;

		check4warnings();
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 0.3;
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