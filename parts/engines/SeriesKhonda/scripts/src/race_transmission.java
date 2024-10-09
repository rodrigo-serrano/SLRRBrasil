package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class race_transmission extends Transmission
{
	public race_transmission( int id )
	{
		super( id );
		name = "Cambio 6 Marchas Honda Serie K";
		description = "";

		value = 1363.63;
		brand_new_prestige_value = 60;
		setMaxWear(kmToMaxWear(720000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.642;
		ratio[2]	= 2.080;
		ratio[3]	= 1.361;
		ratio[4]	= 1.023;
		ratio[5]	= 0.829;
		ratio[6]	= 0.686;
		ratio[7]	= -3.673;
		end_ratio	= 4.105;
		starter_torque	= 80;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		maxRPM = 14000.0;
		inertia = kgToInertia(28);

		check4warnings();

		drive_type = DT_FWD | DT_RWD;
		drive_front_min = 0.00;
		drive_front_max = 1.00;
		def_drive_front = 1.00;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
