package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Shimutshibu_RC_T5600R1_transmission extends Transmission
{
	public Shimutshibu_RC_T5600R1_transmission( int id )
	{
		super( id );
		name = "Powertech 1.0 transmission";
		description = "A curta relacao do Celta transitem ao carro mais agilidade nas saidas.";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 4.27;
		ratio[2]	= 2.35;
		ratio[3]	= 1.48;
		ratio[4]	= 1.05;
		ratio[5]	= 0.8;
		ratio[7]	= -3.0;
		end_ratio	= 4.41;
		starter_torque	= 40.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.95;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.1);

		drive_type = DT_FWD;
		drive_front_min = 0.25;
		drive_front_max = 0.75;
		def_drive_front = 0.50;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}

}
