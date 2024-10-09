package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_duratec_v6_awd extends Transmission
{
	public cambio_duratec_v6_awd( int id )
	{
		super( id );
		name = "Cambio Motor V6 Ford Duratec AWD";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 3800;
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 6;
		ratio[0]	= 0;
		ratio[1]	= 4.484;
		ratio[2]	= 2.872;
		ratio[3]	= 1.842;
		ratio[4]	= 1.414;
		ratio[5]	= 1.000;
		ratio[6]	= 0.742;
		ratio[7]	=-2.880;
		end_ratio	= 3.160;

		starter_torque	= 100.0;

		inertia = kgToInertia(13.0);

		maxRPM = 9000.0;

		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.50;
		def_drive_front = 0.50;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
