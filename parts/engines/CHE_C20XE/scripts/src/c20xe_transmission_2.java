package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class c20xe_transmission_2 extends Transmission
{
	public c20xe_transmission_2( int id )
	{
		super( id );
		name = "C20XE RWD transmission";
		description = "";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.549;
		ratio[2]	= 2.510;
		ratio[3]	= 1.760;
		ratio[4]	= 1.210;
		ratio[5]	= 0.930;
		ratio[6]	= 0.750;
		ratio[7]	= -4.000;
		end_ratio	= 3.786;
		
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
		def_drive_front = 0.35;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}
}