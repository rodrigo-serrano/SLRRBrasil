package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class vr_6_2_8_intake_manifold extends IntakeManifold
{
	public vr_6_2_8_intake_manifold( int id )
	{
		super( id );
		name = "Coletor De Admissao VW VR6 2.8";
		description = "";

		value = tHUF2USD(73);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(630000.0));

		fuel_rail_slot_ID=10;

		efficiency = 0.75;

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

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 31 );
		if (!p)
			return "O Coletor De Admissao esta sem Pe.";

                p = partOnSlot( 33 );
		if (!p)
			return "O Coletor De Admissao esta sem TBI.";

		return super.isDynoable();
	}
}