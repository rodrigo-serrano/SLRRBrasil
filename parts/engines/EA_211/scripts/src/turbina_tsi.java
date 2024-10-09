package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_tsi extends TurboCharger
{
	public turbina_tsi( int id )
	{
		super( id );
		name = "Turbina Original Up Tsi";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1200;

		calculateOptandRange (950.0, 6500.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 0.8;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.75;
		min_waste	= 0.25;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
