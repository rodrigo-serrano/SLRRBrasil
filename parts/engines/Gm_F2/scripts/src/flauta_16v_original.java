package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class flauta_16v_original extends FuelInjectorSystem
{
	public flauta_16v_original( int id )
	{
		super( id );
		name = "Flauta De Combustivel GM F2 16v";
		description = "";

		value = 400;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		max_fuel_consumption	= 0.05;
		default_mixture_ratio	= 14.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}