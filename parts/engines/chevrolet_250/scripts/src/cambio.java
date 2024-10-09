package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio extends Transmission
{
	public cambio( int id )
	{
		super( id );
		name = "Cambio Opala 4 Marchas";
		description = "";
		brand_new_prestige_value = 60;

		value = 500;
		setMaxWear(kmToMaxWear(211000.0));

		gears	= 4;
		ratio[0]	= 0.0;
		ratio[1]	= 4.22;
		ratio[2]	= 2.36;
		ratio[3]	= 1.47;
		ratio[4]	= 1.00;
		ratio[7]	= -3.68;
		end_ratio	= 3.99;

		starter_torque	= 80.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		inertia = kgToInertia(28.0);

		maxRPM = 10000.0;

		check4warnings();

		drive_type = DT_RWD;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
