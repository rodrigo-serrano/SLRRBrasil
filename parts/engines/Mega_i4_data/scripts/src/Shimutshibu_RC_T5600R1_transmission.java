package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Shimutshibu_RC_T5600R1_transmission extends Transmission
{
	public Shimutshibu_RC_T5600R1_transmission( int id )
	{
		super( id );
		name = "Powertech transmission";
		description = "With original GM Kadett GS gear box.";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.42;
		ratio[2]	= 2.16;
		ratio[3]	= 1.48;
		ratio[4]	= 1.12;
		ratio[5]	= 0.89;
		ratio[7]	= -3.0;
		end_ratio	= 3.73;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.05;

		maxRPM = 10000.0;
		inertia = kgToInertia(9.1);

		drive_type = DT_FWD;
		drive_front_min = 0.00;
		drive_front_max = 1.00;
		def_drive_front = 1.00;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}
}
