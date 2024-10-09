package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_block extends Block_Vee_OHC
{
	public MC_block( int id )
	{
		super( id );
		name = "Bloco Motor Subaru EJ25";
		description = "";

		brand_new_prestige_value = 269.86;
		value = 8000;
		setMaxWear(kmToMaxWear(5420000.0));

		bore = 94.5;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 280.60;

		crankshaft_slot_ID = 8;
		transmission_slot_ID = 5;
		crankshaft_bearing_slot_ID = 99;
		oil_pan_slot_ID = 9;

		L_cylinder_head_slot_ID = 45;
		R_cylinder_head_slot_ID = 46;
		intake_manifold_slot_ID = 14;

		rpm_idle = 800.0;
		time_spark_min	= sparkAngleTo4cycleTime(325.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 4000;
		time_spark_RPM1	= 8550;
		RPM_limit	= 7666;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();
		// Subaru EJ25 Sounds scripted by LamboFreak //
                // Recorded in Forza Motorsport 4 and Forza Horizon 3 with some sounds lightly edited by LamboFreak //
		if (the_car)
		{
			float ex = 3.0;
			float in = 2.5;
			float turbo_vol = 2.5;
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))//ON
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FA5r), 800,   500.0, 1589.0, 0.35+ex, 0.40+ex);//1
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FA6r), 1589,  800.0, 2583.0, 0.40+ex, 0.45+ex);//2
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FA7r), 2583,  1589.0, 3662.0, 0.45+ex, 0.50+ex);//3
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FA8r), 3662,  2583.0, 4614.0, 0.50+ex, 0.55+ex);//4
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FA9r), 4614,  3662.0, 5416.0, 0.55+ex, 0.60+ex);//5
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FAAr), 5416,  4614.0, 6429.0, 0.60+ex, 0.65+ex);//6
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FABr), 6429,  5416.0, 7610.0, 0.65+ex, 0.70+ex);//7
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FACr), 7610,  6429.0, RPM_limit+100, 0.70+ex, 0.75+ex);//8
				if (dynodata.maxHP  >= 500)
				{
					tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FADr), 7766,  RPM_limit-56, 20000.0, 0.70+ex, 0.75+ex);//9 Rev limiter used when over 500 HP
				}
				else
				{
					tab.addItem(new ResourceRef(parts.engines.Boxer4:0x00000FADr), 7766,  RPM_limit-96, 20000.0, 0.70+ex, 0.75+ex);//9 Rev limiter used when under 500 HP
				}
				if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 1.80)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}	
			}

			if (tab = the_car.getSfxTable(1)) //OFF
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFA5r), 800,   500.0, 1589.0, 0.35+in, 0.40+in);//1
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFA6r), 1589,  800.0, 2583.0, 0.40+in, 0.45+in);//2
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFA7r), 2583,  1589.0, 3662.0, 0.45+in, 0.50+in);//3
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFA8r), 3662,  2583.0, 4614.0, 0.50+in, 0.55+in);//4
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFA9r), 4614,  3662.0, 5416.0, 0.55+in, 0.60+in);//5 Used when under 500 HP, no crackles
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFAAr), 5416,  4614.0, 6429.0, 0.60+in, 0.65+in);//6 Used when under 500 HP, no crackles
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFABr), 6429,  5416.0, 20000.0, 0.65+in, 0.70+in);//7
				tab.addItem(new ResourceRef(parts.engines.Boxer4:0x0000FFACr), 7610,  6429.0, 20000.0, 0.70+in, 0.75+in);//8
				if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x00000013r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 1.80)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000011r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                         else if(dynodata.P_turbo_max == 1.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000011r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}				
			}


			if (tab = the_car.getSfxTable(2))//EXHAUST VOLUME MODIFIER
			{
				tab.clear();
				the_car.setSfxExhaustMinVol(0.6);
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 20 );
		if (!p)
			return "O Motor esta sem Alternador.";

		p = partOnSlot( 905 );
		if (!p)
			return "O Motor esta sem Bomba De Agua.";

		return super.isDynoable();
	}
}
