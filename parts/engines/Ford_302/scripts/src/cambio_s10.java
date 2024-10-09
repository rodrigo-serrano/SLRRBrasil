package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_s10 extends Transmission
{
	public cambio_s10( int id )
	{
		super( id );
		name = "Cambio S10 Adaptado para Ford 302";
		description = "";
		brand_new_prestige_value = 60;

		value = 850;
		setMaxWear(kmToMaxWear(211000.0));

		gears	= 5;
		ratio[0]	= 0.0;
		ratio[1]	= 4.68;
		ratio[2]	= 2.44;
		ratio[3]	= 1.50;
		ratio[4]	= 1.00;
		ratio[5]	= 0.81;
		ratio[7]	= -3.0;
		end_ratio	= 3.940;

		starter_torque	= 80.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		inertia = kgToInertia(28.0);

		maxRPM = 10000.0;

		check4warnings();

		drive_type = DT_FWD | DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.40;
		def_drive_front = 0.00;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 1.00;
		def_diff_lock = 0.00;
		diff_lock = def_diff_lock;
	}
}
