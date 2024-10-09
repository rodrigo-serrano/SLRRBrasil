package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class turbina extends TurboCharger
{
	public turbina( int id )
	{
		super( id );
		name = "Turbina Apl 42/48";
		description = "";
		brand_new_prestige_value = 109.30;

		value = 1500;

		calculateOptandRange (1200.0, 6000.0);
		P_turbo_max	= 1.00;
		default_P_turbo_waste	= 0.8;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.0;
		min_waste	= 0.10;
	}

        public void updatevariables()
	{
		setMaxWear(kmToMaxWear(120000.0));
	}
}