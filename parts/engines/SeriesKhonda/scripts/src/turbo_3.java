package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo_3 extends TurboCharger
{
	public turbo_3( int id )
	{
		super( id );
		name = "Turbina BorgWarner Honda Serie K";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 3000;

		calculateOptandRange (5000.0, 11000.0);
		P_turbo_max	= 2.13;
		default_P_turbo_waste	= 1.00;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 1.0;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(90000.0));
	}	
}