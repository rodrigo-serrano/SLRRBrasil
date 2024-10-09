package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class stock_14_transmission extends Transmission
{
	public stock_14_transmission( int id )
	{
		super( id );
		name = "Transmissao motor CHT 1.4 4spd";
		description = "Relacao Corcel II 1.4";

		value = tHUF2USD(65.210);
		brand_new_prestige_value = 68.98;
		setMaxWear(kmToMaxWear(642000.0));

		gears		= 4;
		ratio[0]	= 0;
		ratio[1]	= 3.61;
		ratio[2]	= 2.26;
		ratio[3]	= 1.48;
		ratio[4]	= 1.032;
		ratio[7]	= -3.46;
		end_ratio	= 4.125;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.82;

		maxRPM = 10000.0;
		inertia = kgToInertia(8.5);

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
