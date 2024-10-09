package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class vr_6_adjustable_transmission extends Transmission
{
	public vr_6_adjustable_transmission( int id )
	{
		super( id );
		name = "Cambio De Corrida Ajustavel VW VR6";
		description = "";

		value = tHUF2USD(654);
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(700000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 4.21;
		ratio[2]	= 2.49;
		ratio[3]	= 1.66;
		ratio[4]	= 1.24;
		ratio[5]	= 1;
		ratio[6]	= 0.875;
		ratio[7]	= -4.0;
		end_ratio	= 2.88;
		starter_torque	= 80.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.45;

		maxRPM = 20000.0;
		inertia = kgToInertia(13.8);

		check4warnings();

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.22;
		diff_lock_max = 0.22;
		def_diff_lock = 0.22;
		diff_lock = def_diff_lock;
	}
}