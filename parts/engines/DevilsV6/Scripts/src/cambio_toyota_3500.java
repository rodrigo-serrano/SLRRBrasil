package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_toyota_3500 extends Transmission
{
	public cambio_toyota_3500( int id )
	{
		super( id );
		name = "Cambio Motor V6 Toyota 2GR 3.5 24v";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 2500;
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.300;
		ratio[2]	= 1.900;
		ratio[3]	= 1.421;
		ratio[4]	= 1.000;
		ratio[5]	= 0.713;
		ratio[6]	= 0.609;
		ratio[7]	=-4.148;
		end_ratio	= 4.200;

		starter_torque	= 100.0;

		inertia = kgToInertia(13.0);

		maxRPM = 9000.0;

		check4warnings();

		drive_type = DT_RWD;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
