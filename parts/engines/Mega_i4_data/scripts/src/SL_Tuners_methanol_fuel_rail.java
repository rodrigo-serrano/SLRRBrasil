package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class SL_Tuners_methanol_fuel_rail extends FuelInjectorSystem
{
	public SL_Tuners_methanol_fuel_rail( int id )
	{
		super( id );
		name = "IDH custom Methanol Rail With Methanol Pump";
		description = "";

		value = tHUF2USD(220.000);
		brand_new_prestige_value = 90.00;
		setMaxWear(kmToMaxWear(9230000.0));

		max_fuel_consumption	= 0.04;
		default_mixture_ratio	= 18.0;
		default_fuel_type	= FT_METHANOL;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		police_check_fine_value	= 500.000;

		check4warnings();
	}
}
