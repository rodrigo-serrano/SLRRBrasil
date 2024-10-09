package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_fiasa extends TurboCharger
{
	public turbina_fiasa( int id )
	{
		super( id );
		name = "Turbina Apl 42/36";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 3000;

		calculateOptandRange (1500.0, 7000.0);
		P_turbo_max	= 2.02;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.3;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
