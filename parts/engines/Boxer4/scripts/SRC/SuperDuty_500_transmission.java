package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class SuperDuty_500_transmission extends Transmission
{
	public SuperDuty_500_transmission( int id )
	{
		super( id );
		name = "Cambio Subaru EJ";
		description = "";

		value = 1500;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.83;
		ratio[2]	= 2.46;
		ratio[3]	= 1.62;
		ratio[4]	= 1.28;
		ratio[5]	= 1.12;
		ratio[6]	= 0.99;
		ratio[7]	=-3.869;
		end_ratio	= 3.55;
		starter_torque	= 120.0;

		adjustable_gears = 4;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.45;

		maxRPM = 10000.0;
		inertia = kgToInertia(10.0);

		check4warnings();

		drive_type = DT_RWD|DT_FWD;
		drive_front_min = 0.5;
		drive_front_max = 0.5;
		def_drive_front = 0.4;
		drive_front = def_drive_front;

		diff_lock_min = 1.0;
		diff_lock_max = 1.0;
		def_diff_lock = 0.35;
		diff_lock = def_diff_lock;
	}
}
