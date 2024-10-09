package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_16v extends TurboCharger
{
	public turbina_16v( int id )
	{
		super( id );
		name = "Turbina Hx40 Para Volkswagen AP 16v";
		description = "";
		brand_new_prestige_value = 209.30;

		value = 3200;

		calculateOptandRange (3500.0, 9900.0);
		P_turbo_max	= 3.00;
		default_P_turbo_waste	= 2.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 3.25;
		min_waste	= 0.80;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
