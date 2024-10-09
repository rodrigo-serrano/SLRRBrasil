package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class juntas_dupla_carburacao extends IntakeManifold
{
	public juntas_dupla_carburacao( int id )
	{
		super( id );
		name = "Baquelites Dupla Carburacao Willys BF-161";
		description = "";

		value = 25;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(400000.0));

		fuel_rail_slot_ID=10;

		efficiency = 1.25;

		check4warnings();
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.50;
		max_air_consumption = 0.50;
		mixture_H = 1.0;
		time_burn = 0.1;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(10)) && unsafePart instanceof AirFuelDeliverySystem)
		{
			AirFuelDeliverySystem mixture_intake = unsafePart;

			mixture_intake.updatevariables();

			mixture_ratio = mixture_intake.mixture_ratio;
			max_fuel_consumption = mixture_intake.max_fuel_consumption;
			mixture_H = mixture_intake.mixture_H;
			time_burn = mixture_intake.time_burn;
		}

		if ( (unsafePart = partOnSlot(30)) && unsafePart instanceof NOSInjectorSystem)
		{
			NOSInjectorSystem nos_intake = unsafePart;

			nos_intake.updatevariables();

			nitro_H = nos_intake.nitro_H;
			nitro_cooling = nos_intake.nitro_cooling;
			nitro_consumption = nos_intake.nitro_consumption;
			nitro_minRPM = nos_intake.nitro_minRPM;
			nitro_maxRPM = nos_intake.nitro_maxRPM;
			nitro_minThrottle = nos_intake.nitro_minThrottle;
		}
	}
}
