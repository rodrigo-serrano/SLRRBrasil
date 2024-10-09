package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_pequena extends TurboCharger
{
	public turbina_pequena( int id )
	{
		super( id );
		name = "Turbina Apl 42/48";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1600;

		calculateOptandRange (2000.0, 7500.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
