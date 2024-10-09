package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Einvagen_110_GT_transmission extends Transmission
{
	public Einvagen_110_GT_transmission( int id )
	{
		super( id );
		name = "Volks VHT 1.0 transmission";
		description = "E um cambio bem acertado, ao mesmo tempo que da oportunidade do motor ser mais economico, tambem deixa o motor mostrar sua forca.";

		value = tHUF2USD(99);
		brand_new_prestige_value = 44.70;
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.9;
		ratio[2]	= 2.12;
		ratio[3]	= 1.37;
		ratio[4]	= 0.97;
		ratio[5]	= 0.76;
		ratio[7]	=-3.31;
		end_ratio	= 4.622;
		starter_torque	= 56.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.00;
		worst_lubrication_sliction=0.00;

		maxRPM = 12000.0;
		inertia = kgToInertia(1.0);

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
