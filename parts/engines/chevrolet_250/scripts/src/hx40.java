package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class hx40 extends TurboCharger
{
	public hx40( int id )
	{
		super( id );
		name = "Turbina Hx40";
		description = "";
		brand_new_prestige_value = 200.00;

		value = 8500;

		calculateOptandRange (2800.0, 9000.0);
		P_turbo_max	= 2.03;
		default_P_turbo_waste	= 1.0;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.2;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
