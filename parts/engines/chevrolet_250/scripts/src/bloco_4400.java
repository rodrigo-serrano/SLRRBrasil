package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class bloco_4400 extends Block_Inline_OHV
{
	public bloco_4400( int id )
	{
		super( id );
		name = "Bloco 4.4 e 5.1 Chevrolet 250";
		description = "";

		value = 3500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 101.6;

		camshaft_slot_ID = 4;
		camshaft_bearing_slot_ID = 24;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 157.66;
		crank_center_to_cylinder_top = 252.65;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(319.0);
		time_spark_inc	= sparkAngleTo4cycleTime(368.0)-time_spark_min;
		time_spark_RPM0	= 2500;
		time_spark_RPM1	= 6000;
		RPM_limit	= 8500;

		cylinders	= 6;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
                        the_car.starter_torque = 30.0;

			 SfxTable tab;
			if (tab = the_car.getSfxTable(0))//on
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001EDr), 2500,   500.0, 3000.0, 0.5, 0.6);//onidle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001F0r), 3500,  1000.0, 3500.0, 0.6, 0.7);//onverylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001EEr), 5000,  2500.0, 5500.0, 0.7, 0.8);//onlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001ECr), 7500,  4000.0, RPM_limit+1600, 0.8, 0.9);//onhigh
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E7r), 6500,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                 if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.03)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.4)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000018r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
					
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E6r), 1000,  500.0, 3500.0, 0.3, 0.4);//idle			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001EBr), 3000,  500.0, 3500.0, 0.4, 0.5);//offverylow			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E9r), 5000,  500.0, 5500.0, 0.5, 0.6);//offlow			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001EAr), 6000,  3500.0, 6500.0, 0.6, 0.7);//offmid			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E8r), 7500,  1000.0, 12000.0, 0.1, 0.8);//offhigh
                                 if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F5r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.03)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				        else if(dynodata.P_turbo_max == 2.4)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F18r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.5)
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

		p = partOnSlot( 4 );
		if (!p)
			return "the engine is missing the camshaft.";

		return super.isDynoable();
	}
}
