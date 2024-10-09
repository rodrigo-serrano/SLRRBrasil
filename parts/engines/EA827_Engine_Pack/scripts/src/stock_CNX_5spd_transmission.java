package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class stock_CNX_5spd_transmission extends Transmission
{
	public stock_CNX_5spd_transmission( int id )
	{
		super( id );
		name = "Cambio Volkswagen AP 16v CNX";
		description = "Stock gearbox for 2.0 16v engines.";

		value = 650;
		brand_new_prestige_value = 68.98;
		setMaxWear(kmToMaxWear(642000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.45;
		ratio[2]	= 2.12;
		ratio[3]	= 1.43;
		ratio[4]	= 1.03;
		ratio[5]	= 0.84;
		ratio[7]	= -3.46;
		end_ratio	= 3.89;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.82;

		maxRPM = 10000.0;
		inertia = kgToInertia(5.0);

		check4warnings();

		drive_type = DT_FWD | DT_RWD;
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
