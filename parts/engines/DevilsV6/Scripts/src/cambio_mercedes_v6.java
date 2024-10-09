package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_mercedes_v6 extends Transmission
{
	public cambio_mercedes_v6( int id )
	{
		super( id );
		name = "Cambio Motor V6 Mercedes";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 3000;
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 6;
		ratio[0]	= 0;
		ratio[1]	= 4.459;
		ratio[2]	= 2.614;
		ratio[3]	= 1.723;
		ratio[4]	= 1.245;
		ratio[5]	= 1.00;
		ratio[6]	= 0.838;
		ratio[7]	=-3.580;
		end_ratio	= 3.270;

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
