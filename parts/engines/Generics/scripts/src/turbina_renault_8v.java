package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_renault_8v extends TurboCharger
{
	public turbina_renault_8v( int id )
	{
		super( id );
		name = "Turbina APL 42/36";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1800;

		calculateOptandRange (2000.0, 7200.0);
		P_turbo_max	= 2.50;
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
