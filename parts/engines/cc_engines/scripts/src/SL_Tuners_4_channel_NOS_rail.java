package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class SL_Tuners_4_channel_NOS_rail extends NOSInjectorSystem
{
	public SL_Tuners_4_channel_NOS_rail( int id )
	{
		super( id );
		name = "Nitros Express NITRO injection";
		description = "";

		brand_new_prestige_value = 100.58;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(91000000.0));

		maxconsumption		= 8.16; // 1080 lbs/hr
		minconsumption		= 0.544; // 72 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 13000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
