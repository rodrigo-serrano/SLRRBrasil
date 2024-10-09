package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class SuperDuty_Extra_750_transmission extends Transmission
{
	public SuperDuty_Extra_750_transmission( int id )
	{
		super( id );
		name = "Cambio Racing Subaru EJ";
		description = "";

		value = 5500;
		brand_new_prestige_value = 221.30;
		setMaxWear(kmToMaxWear(720000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.83;
		ratio[2]	= 2.46;
		ratio[3]	= 1.49;
		ratio[4]	= 1.26;
		ratio[5]	= 0.95;
		ratio[6]	= 0.80;
		ratio[7]	=-3.869;
		end_ratio	= 3.55;
		starter_torque	= 250.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		maxRPM = 14000.0;
		inertia = kgToInertia(6.5);

		check4warnings();

		drive_type = DT_FWD | DT_RWD;
		drive_front_min = 0.00;
		drive_front_max = 1.00;
		def_drive_front = 0.40;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.15;
		diff_lock = def_diff_lock;
	}
}
