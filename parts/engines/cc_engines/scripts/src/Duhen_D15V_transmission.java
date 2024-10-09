package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D15V_transmission extends Transmission
{
	public Duhen_D15V_transmission( int id )
	{
		super( id );
		name = "Endura-E 1.0/Zetec 1.0 transmission";
		description = "Novo reajuste da transmissao do motor Ford 1.0 faz com que os giros se mantem em alta nas mudancas resultando em pouca perda de aproveitamento da potencia do motor 1000cc.";

		value = tHUF2USD(99);
		brand_new_prestige_value = 44.70;
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 4.087;
		ratio[2]	= 2.287;
		ratio[3]	= 1.518;
		ratio[4]	= 1.108;
		ratio[5]	= 0.88;
		ratio[7]	=-3.310;
		end_ratio	= 4.06;
		starter_torque	= 112.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=1.00;
		worst_lubrication_sliction=0.05;

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
