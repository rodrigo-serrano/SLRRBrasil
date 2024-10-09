package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Race_transmission extends Transmission
{
	public Race_transmission( int id )
	{
		super( id );
		name = "OHC RWD 4 transmission";
		description = "For racing ! Thats can more 420mph !.";

		value = tHUF2USD(200);
		brand_new_prestige_value = 20.96;
		setMaxWear(kmToMaxWear(300000.0));

        gears		= 4;
		ratio[0]	= 0;
		ratio[1]	= 3.6;
		ratio[2]	= 1.9;
		ratio[3]	= 1.4;
		ratio[4]	= 1.0;
		ratio[7]	= -3.5;
		end_ratio	= 3.40;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears //


        maxRPM = 14000.0;
		inertia = kgToInertia(13.0);
		
		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 1.00;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = diff_lock_min;
		diff_lock = def_diff_lock;
	}
}

