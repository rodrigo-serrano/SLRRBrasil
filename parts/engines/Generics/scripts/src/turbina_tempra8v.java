package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina_tempra8v extends TurboCharger
{
	public turbina_tempra8v( int id )
	{
		super( id );
		name = "Turbina Original Tempra Turbo 8v";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1800;

		calculateOptandRange (2200.0, 7500.0);
		P_turbo_max	= 2.52;
		default_P_turbo_waste	= 0.55;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.5;
		min_waste	= 0.2;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}	
}