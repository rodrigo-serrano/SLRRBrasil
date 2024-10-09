package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class DevilsV6_Power_NOS_rail extends NOSInjectorSystem
{
	public DevilsV6_Power_NOS_rail( int id )
	{
		super( id );
		name = "Kit Nitro Motor V6 Plenum";
		description = "";

		value = 4500;
		brand_new_prestige_value = 138.62;
		setMaxWear(kmToMaxWear(1000000.0));

		maxconsumption		= 8.16; // 1080 lbs/hr
		minconsumption		= 1.088; // 144 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 6000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
