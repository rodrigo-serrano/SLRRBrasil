package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class twin_turbo extends TurboCharger
{
	public twin_turbo( int id )
	{
		super( id );
		name = "Twin Turbo VW VR6";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 6000;

		calculateOptandRange (5200.0, 10750.0);
		P_turbo_max	= 2.8;
		default_P_turbo_waste	= 1.50;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.8;
		min_waste	= 0.2;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}	
}