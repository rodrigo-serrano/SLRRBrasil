package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco_hyundai_3300 extends Block_DevilsV6
{
	public bloco_hyundai_3300( int id )
	{
		super( id );
		name = "Bloco Motor V6 Hyundai 3.3";
		description = "";

		brand_new_prestige_value = 69.86;
		value = 2000;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 92.00;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 260.70;

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
		time_spark_RPM0	= 5300;
		time_spark_RPM1	= 6400;
		RPM_limit	= 7800;

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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000039Er), 3217.5*1.35, 500.0, 2000.0, 0.65, 0.85); //gtr_onidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A0r), 4762.0*1.35, 1500.0, 3500.0, 0.75, 0.85); //gtr_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A2r), 4000.0*1.35, 3000.0, 6000.0, 0.75, 0.75); //gtr_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A4r), 5240.0*1.35, 4500.0, 18000.0, 0.65, 0.75); //gtr_onhigh
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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A7r), 4492.4*1.35, 500.0, 2000.0, 0.90, 1.00); //gtr_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A9r), 4762.0*1.35, 1500.0, 4000.0, 0.90, 1.00); //gtr_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003ABr), 4000.0*1.35, 3500.0, 6500.0, 0.75, 0.85); //gtr_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003ACr), 5240.0*1.35, 4000.0, 18000.0, 0.50, 0.80); //gtr_offhigh
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
				the_car.setSfxExhaustMinVol(0.8);
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
