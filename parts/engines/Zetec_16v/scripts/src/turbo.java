package java.game.parts.engines.Zetec_16v;

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
		name = "Garrett T28 Turbo";
		description = "Para Zetec 16v";
		brand_new_prestige_value = 109.30;

		value = 1750;

		calculateOptandRange (2500.0, 7500.0);
		P_turbo_max	= 2.2;
		default_P_turbo_waste	= 1.00;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 2.2;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
