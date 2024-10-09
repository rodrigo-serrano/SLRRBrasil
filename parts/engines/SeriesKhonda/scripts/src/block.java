package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class block extends Block_Inline_OHC
{
	public block( int id )
	{
		super( id );
		name = "Bloco Motor Honda K20";
		description = "";

		value = 1000;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(300000.0));

		bore = 86.002;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 170.50;
		crank_center_to_cylinder_top = 212.00+0.635;

		rpm_idle = 800.0;
		time_spark_min	= sparkAngleTo4cycleTime(318.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 3750;
		time_spark_RPM1	= 6250;
		RPM_limit	= 7800;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))//on
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000ADr), 2000,   500.0, 3000.0, 0.5, 0.6);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000B0r), 3000,  1500.0, 4500.0, 0.6, 0.7);//verylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000AEr), 5000,  3000.0, 6000.0, 0.7, 0.8);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000AFr), 6500,  4500.0, RPM_limit+600.0, 0.8, 0.9);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A8r), 9000,  RPM_limit-600.0, 18000.0, 0.9, 0.9);//limiter
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.13)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.10)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000018r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A7r), 1200,   500.0, 1200.0, 0.3, 0.4);//idle			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000AAr), 2975,   800.0, 4000.0, 0.4, 0.5);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000ABr), 6400,  2500.0, 5500.0, 0.5, 0.6);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A9r), 7900,  4000.0, 18000.0, 0.6, 0.7);//high
                                 if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F4r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.13)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.10)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F18r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				the_car.setSfxExhaustMinVol(0.9);
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 111 );
		if (!p)
			return "O Motor esta sem Alternador.";

		return super.isDynoable();
	}
}
