package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbo extends TurboCharger
{
	public turbo( int id )
	{
		super( id );
		name = "Turbina Master Power 60/63";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 2800;

		calculateOptandRange (3500.0, 9000.0);
		P_turbo_max	= 2.5;
		default_P_turbo_waste	= 1.20;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.2;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(90000.0));
	}	
}