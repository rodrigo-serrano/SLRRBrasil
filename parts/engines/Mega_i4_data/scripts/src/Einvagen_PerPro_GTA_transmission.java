package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Einvagen_PerPro_GTA_transmission extends Transmission
{
	public Einvagen_PerPro_GTA_transmission( int id )
	{
		super( id );
		name = "Volkswagen GTI transmission";
		description = "Original Golf GTI Mk4, For More speed";

		value = tHUF2USD(99);
		brand_new_prestige_value = 44.70;
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.3;
		ratio[2]	= 1.94;
		ratio[3]	= 1.31;
		ratio[4]	= 1.03;
		ratio[5]	= 0.84;
		ratio[7]	=-3.31;
		end_ratio	= 2.97;
		starter_torque	= 12.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.00;
		worst_lubrication_sliction=0.10;

		maxRPM = 12000.0;
		inertia = kgToInertia(7.0);

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.18;
		diff_lock_max = 0.18;
		def_diff_lock = 0.18;
		diff_lock = def_diff_lock;
	}
}
