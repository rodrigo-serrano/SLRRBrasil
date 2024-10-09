package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_marea_1800 extends TurboCharger
{
	public turbina_marea_1800( int id )
	{
		super( id );
		name = "Turbina Borg Warner K16";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 2400;

		calculateOptandRange (2200.0, 7200.0);
		P_turbo_max	= 2.25;
		default_P_turbo_waste	= 1.50;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.01;
		min_waste	= 0.6;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
