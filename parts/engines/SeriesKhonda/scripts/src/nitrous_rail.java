package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class nitrous_rail extends NOSInjectorSystem
{
	public nitrous_rail( int id )
	{
		super( id );
		name = "Kit Nitro Zex Honda Serie K";
		description = "";

		value = 2800;
		brand_new_prestige_value = 159.67;
		setMaxWear(kmToMaxWear(1000000.0));

		maxconsumption		= 5.44; // 720 lbs/hr
		minconsumption		= 0.544; // 72 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 8000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
