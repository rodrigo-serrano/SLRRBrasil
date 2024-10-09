package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_lada extends Transmission
{
	public cambio_lada( int id )
	{
		super( id );
		name = "Cambio Lada Laika 1.6 8v";
		description = "";

		value = 800;
		brand_new_prestige_value = 68.98;
		setMaxWear(kmToMaxWear(642000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.670;
		ratio[2]	= 2.100;
		ratio[3]	= 1.370;
		ratio[4]	= 1.000;
		ratio[5]	= 0.820;
		ratio[7]	= -3.71;
		end_ratio	= 4.300;
		starter_torque	= 60.0;
		
		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.82;

		maxRPM = 10000.0;
		inertia = kgToInertia(8.1);

		check4warnings();

		drive_type = DT_RWD;

		diff_lock_min = 0.50;
		diff_lock_max = 1.00;
		def_diff_lock = 1.00;
		diff_lock = def_diff_lock;
	}
}
