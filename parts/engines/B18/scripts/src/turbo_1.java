package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo_1 extends TurboCharger
{
	public turbo_1( int id )
	{
		super( id );
		name = "Turbina Holset HX40";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 3800;

		calculateOptandRange (4500.0, 11000.0);
		P_turbo_max	= 2.51;
		default_P_turbo_waste	= 2.00;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(90000.0));
	}        
}