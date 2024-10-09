package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class zetec_n2o extends NOSInjectorSystem
{
	public zetec_n2o( int id )
	{
		super( id );
		name = "Kit Nitro Zetec 16v ITB";
		description = "";

		brand_new_prestige_value = 100.58;

		value = 2200;
		setMaxWear(kmToMaxWear(1000000.0));

		maxconsumption		= 5.544; // 360 lbs/hr
		minconsumption		= 2.544; // 72 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 8000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
