package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_big_20v extends TurboCharger
{
	public turbina_big_20v( int id )
	{
		super( id );
		name = "Turbina Hx50 Para Volkswagen AP 20v";
		description = "";
		brand_new_prestige_value = 209.30;

		value = 3800;

		calculateOptandRange (4000.0, 12000.0);
		P_turbo_max	= 5.00;
		default_P_turbo_waste	= 2.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 3.00;
		min_waste	= 0.80;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
