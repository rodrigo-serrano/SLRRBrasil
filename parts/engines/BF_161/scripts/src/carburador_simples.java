package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class carburador_simples extends FuelInjectorSystem
{
	public carburador_simples( int id )
	{
		super( id );
		name = "Carburador Simples Willys";
		description = "";
		brand_new_prestige_value = 70.70;

		value = 300;
		setMaxWear(kmToMaxWear(390000.0));

		mixture_ratio		= 14.7;
		max_fuel_consumption	= 0.1;
		fuel_type		= FT_GAS_95;
		calcStuffs();

		check4warnings();
	}
}