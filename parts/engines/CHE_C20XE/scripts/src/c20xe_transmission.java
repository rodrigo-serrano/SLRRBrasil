package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class c20xe_transmission extends Transmission
{
	public c20xe_transmission( int id )
	{
		super( id );
		name = "C20XE FWD transmission";
		description = "";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.577;
		ratio[2]	= 2.140;
		ratio[3]	= 1.480;
		ratio[4]	= 1.120;
		ratio[5]	= 0.890;
		ratio[7]	= -3.330;
		end_ratio	= 3.450;
		
		starter_torque	= 20.0;
		
		adjustable_gears = 1+2+4; // forward gears //

		maxRPM = 12000.0;
		inertia = kgToInertia(28.0);
		amount_of_oil_needed = 1.0; // internally lubricated //
		best_lubrication_sliction=1.2;
		worst_lubrication_sliction=0.5;

		drive_type = DT_FWD;
		drive_front_min = 0.00;
		drive_front_max = 1.00;
		def_drive_front = 1.00;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}
}