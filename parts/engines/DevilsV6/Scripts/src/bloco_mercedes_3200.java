package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco_mercedes_3200 extends Block_DevilsV6
{
	public bloco_mercedes_3200( int id )
	{
		super( id );
		name = "Bloco Motor V6 Mercedes 3.2 M112";
		description = "";

		brand_new_prestige_value = 69.86;
		value = 2500;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 89.90;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 253.55;

		crankshaft_slot_ID = 8;
		transmission_slot_ID = 5;
		crankshaft_bearing_slot_ID = 99;
		oil_pan_slot_ID = 9;

		L_cylinder_head_slot_ID = 45;
		R_cylinder_head_slot_ID = 46;
		intake_manifold_slot_ID = 14;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(325.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 3850;
		time_spark_RPM1	= 5500;
		RPM_limit	= 7000;

		cylinders	= 6;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000025Fr), 2000,   500.0, 2500.0, 0.5, 0.6);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000260r), 3000,  1000.0, 4000.0, 0.6, 0.7);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000261r), 4500,  2500.0, 5500.0, 0.7, 0.8);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000025Er), 6000,  4000.0, RPM_limit+600, 0.8, 0.8);//high
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000259r), 7500,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 3.01)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 1.75)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000018r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.15)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000258r),  900,   500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000025Br), 3000,   700.0, 4000.0, 0.4, 0.5);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000025Cr), 4500,  2500.0, 5500.0, 0.5, 0.6);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000025Ar), 6000,  4000.0, 18000.0, 0.6, 0.7);//high
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F5r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 3.01)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000010r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000011r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.75)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F18r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.15)
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

		p = partOnSlot( 20 );
		if (!p)
			return "O Motor esta sem Alternador.";

		return super.isDynoable();
	}
}
