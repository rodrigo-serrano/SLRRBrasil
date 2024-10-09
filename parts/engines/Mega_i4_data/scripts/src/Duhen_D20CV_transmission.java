package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D20CV_transmission extends Transmission
{
	public Duhen_D20CV_transmission( int id )
	{
		super( id );
		name = "Duratec 4x4 Transmission";
		description = "Ford transmission.";
		brand_new_prestige_value = 75.00;

		value = tHUF2USD(240);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.67;
		ratio[2]	= 2.06;
		ratio[3]	= 1.308;
		ratio[4]	= 0.968;
		ratio[5]	= 0.764;
		ratio[7]	= -3.0;
		end_ratio	= 4.58;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.95;

		maxRPM = 12000.0;
		inertia = kgToInertia(7.5);

		drive_type = DT_FWD;
		drive_front_min = 0.00;
		drive_front_max = 0.50;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.50;
		diff_lock_max = 1.00;
		def_diff_lock = 1.00;
		diff_lock = def_diff_lock;
	}
}
