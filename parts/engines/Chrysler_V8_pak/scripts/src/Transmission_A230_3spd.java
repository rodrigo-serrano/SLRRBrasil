package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Transmission_A230_3spd extends Transmission
{
	public Transmission_A230_3spd( int id )
	{
		super( id );
		name = "Cambio Dodge Dart 3 Marchas";
		description = "";
		brand_new_prestige_value = 55.55;

		value = 800;
		setMaxWear(kmToMaxWear(520000.0));

		gears		= 3;
		ratio[0]	= 0;
		ratio[1]	= 2.910;
		ratio[2]	= 1.750;
		ratio[3]	= 1.000;
		ratio[7]	= -2.510;
		end_ratio	= 3.310;

		starter_torque	= 40.0;

		adjustable_gears = 1+2+4;

		inertia = kgToInertia(13.0);
		maxRPM = 9000.0;



		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}
}
