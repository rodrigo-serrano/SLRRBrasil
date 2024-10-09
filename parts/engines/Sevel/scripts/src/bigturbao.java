package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class bigturbao extends TurboCharger
{
	public bigturbao( int id )
	{
		super( id );
		name = "Turbina Hx35";
		description = "";
		brand_new_prestige_value = 200.00;

		value = 5500;

		calculateOptandRange (4500.0, 15000.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.0;
		min_waste	= 0.8;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
