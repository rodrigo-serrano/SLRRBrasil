package java.game.parts.engines.CHT_Pack_Engine;

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
		name = "Garrett GT3082R Turbo";
		description = "Para CHT";
		brand_new_prestige_value = 109.30;

		value = tHUF2USD(349.878);

		calculateOptandRange (2000.0, 7000.0);
		P_turbo_max	= 1.45;
		default_P_turbo_waste	= 1.20;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.5;
		min_waste	= 0.5;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}



	
}
