package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class stock_transmission extends Transmission
{
	public stock_transmission( int id )
	{
		super( id );
		name = "Cambio 5 Marchas Honda Serie K";
		description = "";

		value = 900;
		brand_new_prestige_value = 60;
		setMaxWear(kmToMaxWear(211000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.266;
		ratio[2]	= 1.880;
		ratio[3]	= 1.212;
		ratio[4]	= 0.921;
		ratio[5]	= 0.738;
		ratio[7]	= -3.583;
		end_ratio	= 4.389;
		starter_torque	= 80.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		maxRPM = 10000.0;
		inertia = kgToInertia(28);

		check4warnings();

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.50;
		diff_lock_max = 1.00;
		def_diff_lock = 1.00;
		diff_lock = def_diff_lock;
	}
}
