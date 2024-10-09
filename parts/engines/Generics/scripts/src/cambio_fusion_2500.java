package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class cambio_fusion_2500 extends Transmission
{
	public cambio_fusion_2500( int id )
	{
		super( id );
		name = "Cambio Ford Fusion 2.5 16v 6 Marchas";
		description = "";

		value = 950;
		brand_new_prestige_value = 68.98;
		setMaxWear(kmToMaxWear(642000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 4.580;
		ratio[2]	= 2.960;
		ratio[3]	= 1.910;
		ratio[4]	= 1.450;
		ratio[5]	= 1.000;
		ratio[6]	= 0.750;
		ratio[7]	= -2.94;
		end_ratio	= 3.070;
		starter_torque	= 60.0;
		
		adjustable_gears = 1+2+4; // forward gears //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.0;
		worst_lubrication_sliction=0.82;

		maxRPM = 10000.0;
		inertia = kgToInertia(8.1);

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
