package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo extends TurboCharger
{
	public turbo( int id )
	{
		super( id );
		name = "Turbina Borgwarner KKK K03 Audi 20v";
		description = "stock for Volkswagen EA827 20v turbo";
		brand_new_prestige_value = 109.30;

		value = 1300;

		calculateOptandRange (950.0, 8000.0);
		P_turbo_max	= 0.75;
		default_P_turbo_waste	= 0.8;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 0.75;
		min_waste	= 0.25;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
