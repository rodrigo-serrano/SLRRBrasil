package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class N2O_rail extends NOSInjectorSystem
{
	public N2O_rail( int id )
	{
		super( id );
		name = "Kit Nitro Motor Fusca";
		description = "";

		brand_new_prestige_value = 100.58;

		value = 2000;
		setMaxWear(kmToMaxWear(1000000.0));

		maxconsumption		= 3.5; // 360 lbs/hr
		minconsumption		= 1.5; // 72 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 8000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
