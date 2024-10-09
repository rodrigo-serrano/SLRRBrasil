package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_duratec extends TurboCharger
{
	public turbina_duratec( int id )
	{
		super( id );
		name = "Turbina Zr 50/63";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 4400;

		calculateOptandRange (2200.0, 8500.0);
		P_turbo_max	= 1.80;
		default_P_turbo_waste	= 1.2;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.8;
		min_waste	= 0.3;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
