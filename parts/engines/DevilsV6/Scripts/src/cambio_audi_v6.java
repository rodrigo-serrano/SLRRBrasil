package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_audi_v6 extends Transmission
{
	public cambio_audi_v6( int id )
	{
		super( id );
		name = "Cambio Motor V6 Audi";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 2000;
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.500;
		ratio[2]	= 1.940;
		ratio[3]	= 1.300;
		ratio[4]	= 0.940;
		ratio[5]	= 0.790;
		ratio[7]	=-3.440;
		end_ratio	= 3.890;

		starter_torque	= 100.0;

		inertia = kgToInertia(13.0);

		maxRPM = 9000.0;

		check4warnings();

		drive_type = DT_FWD;
		drive_front_min = 0.0;
		drive_front_max = 1.00;
		def_drive_front = 1.00;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
