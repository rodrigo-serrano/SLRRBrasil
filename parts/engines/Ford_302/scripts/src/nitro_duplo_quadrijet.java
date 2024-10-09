package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class nitro_duplo_quadrijet extends NOSInjectorSystem
{
	public nitro_duplo_quadrijet( int id )
	{
		super( id );
		name = "Kit Nitro Motor Ford 302 Dupla Quadrijet";
		description = "";

		brand_new_prestige_value = 100.58;

		value = 10000;
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
