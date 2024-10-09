package java.game.parts.engines.B18;

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
		name = "Cambio Civic VTI";
		description = "";

		value = 1000;
		brand_new_prestige_value = 60;
		setMaxWear(kmToMaxWear(211000.0));

		gears	= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.23;
		ratio[2]	= 2.10;
		ratio[3]	= 1.45;
		ratio[4]	= 1.107;
		ratio[5]	= 0.848;
		ratio[6]	= -3.0;
		end_ratio	= 4.40;

		starter_torque	= 80.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		inertia = kgToInertia(28.0);

		maxRPM = 10000.0;

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
