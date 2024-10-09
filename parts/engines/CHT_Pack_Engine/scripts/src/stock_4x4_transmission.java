package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class stock_4x4_transmission extends Transmission
{
	public stock_4x4_transmission( int id )
	{
		super( id );
		name = "Transmissão 4 marchas RWD motor CHT";
		description = "";

		value = tHUF2USD(76.817);
		brand_new_prestige_value = 114.96;
		setMaxWear(kmToMaxWear(720000.0));

		gears		= 4;
		ratio[0]	= 0;
		ratio[1]	= 3.82;
		ratio[2]	= 2.05;
		ratio[3]	= 1.33;
		ratio[4]	= 0.97;
		ratio[7]	= -3.5;
		end_ratio	= 4.125;
		starter_torque	= 10.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.3; // internally lubricated //
		best_lubrication_sliction = 0.5;
		worst_lubrication_sliction = 0.2;

		maxRPM = 14000.0;
		inertia = kgToInertia(1.0);

		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.10;
		diff_lock_max = 0.99;
		def_diff_lock = 0.30;
		diff_lock = def_diff_lock;
	}
}
