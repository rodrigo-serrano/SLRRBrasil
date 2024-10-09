package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D22V_transmission extends Transmission
{
	public Duhen_D22V_transmission( int id )
	{
		super( id );
		name = "Zetec 1.6 transmission";
		description = "Ford Ecosport 1.6 ratio.";
		brand_new_prestige_value = 44.70;

		value = tHUF2USD(129);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.583;
		ratio[2]	= 1.93;
		ratio[3]	= 1.41;
		ratio[4]	= 1.108;
		ratio[5]	= 0.878;
		ratio[7]	=-3.620;
		end_ratio	= 4.257;
		starter_torque	= 50.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.01; // internally lubricated //
		best_lubrication_sliction=0.8;
		worst_lubrication_sliction=0.1;

		maxRPM = 12000.0;
		inertia = kgToInertia(5.0);

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.02;
		diff_lock_max = 0.50;
		def_diff_lock = 1.00;
		diff_lock = def_diff_lock;
	}
}
