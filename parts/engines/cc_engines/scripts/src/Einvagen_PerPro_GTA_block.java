package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_block extends Block_Inline_OHC
{
	public Einvagen_PerPro_GTA_block( int id )
	{
		super( id );
		name = "Volkswagen AT 1.0 16v block";
		description = "Derivado do Projeto EA-111, o AT (Alta Tecnologia) fez pouco sucesso no mercado, porem era um motor que trabalha muito bem e tem mais folego em altos giros do que seu proprio sucessor, VHT 1.0. Esse motor equipou o Gol Plus Mk3, Gol Power 16v Mk3 e Polo 2003.";

		value = tHUF2USD(130);
		brand_new_prestige_value = 55.70;
		setMaxWear(kmToMaxWear(300000.0));

		bore = 67.1;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 124.66;
		crank_center_to_cylinder_top = 248.37;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(323.0);
		time_spark_inc	= sparkAngleTo4cycleTime(355.0)-time_spark_min;
		time_spark_RPM0	= 2200;
		time_spark_RPM1	= 6500;
		RPM_limit	= 6750;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		getCar_LocalVersion();

		if (the_car)
		{

			SfxTable tab;
			if (tab = the_car.getSfxTable(0))//on
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000194r), 2000,   500.0, 2500.0, 0.5, 0.6);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000195r), 3500,  1000.0, 4000.0, 0.6, 0.7);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000196r), 5500,  2500.0, 5500.0, 0.7, 0.8);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000193r), 6500,  4000.0, RPM_limit+600, 0.8, 0.9);//high
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000018Er), 8000,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                 if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 4.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.19)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.75)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.1)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000018Dr),  750,   500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000191r), 4000,   700.0, 4000.0, 0.4, 0.5);//lowmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000192r), 5500,  2500.0, 5500.0, 0.5, 0.6);//mid				
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000018Fr), 6500,  4000.0, 18000.0, 0.6, 0.7);//high
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004ECr), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                   if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 4.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000010r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000011r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.19)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.75)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000010r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.1)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F19r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
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

		p = partOnSlot( 14 );
		if (!p)
			return "the engine is missing the alternator.";

		return super.isDynoable();
	}
}
