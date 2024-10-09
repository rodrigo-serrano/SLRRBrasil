package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_bx extends Transmission
{
	public cambio_bx( int id )
	{
		super( id );
		name = "Cambio Gol Bx";
		description = "";
		brand_new_prestige_value = 60;

		value = 2700;
		setMaxWear(kmToMaxWear(211000.0));

		gears	= 4;
		ratio[0]	= 0.0;
		ratio[1]	= 3.80;
		ratio[2]	= 2.06;
		ratio[3]	= 1.32;
		ratio[4]	= 0.88;
		ratio[7]	= -3.0;
		end_ratio	= 3.875;

		starter_torque	= 80.0;

		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.9;

		inertia = kgToInertia(28.0);

		maxRPM = 10000.0;

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
