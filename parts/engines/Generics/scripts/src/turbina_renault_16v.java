package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_renault_16v extends TurboCharger
{
	public turbina_renault_16v( int id )
	{
		super( id );
		name = "Turbina Biaggio 50/48";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 2800;

		calculateOptandRange (2200.0, 8500.0);
		P_turbo_max	= 1.35;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.5;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
