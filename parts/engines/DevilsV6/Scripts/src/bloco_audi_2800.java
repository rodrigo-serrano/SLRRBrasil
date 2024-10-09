package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco_audi_2800 extends Block_DevilsV6
{
	public bloco_audi_2800( int id )
	{
		super( id );
		name = "Bloco Motor V6 Audi 2.8";
		description = "";

		brand_new_prestige_value = 69.86;
		value = 2000;
		setMaxWear(kmToMaxWear(620000.0));

		bore = 82.50;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 240.00;

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
		time_spark_RPM0	= 3000;
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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000059Er), 1442.48, 500.0, 2000.0, 0.65, 0.85); //32_onidle_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000059Fr), 2289.8, 1500.0, 2500.0, 0.65, 0.85); //32_onverylow_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x00000540r), 2610.6, 2000.0, 3500.0, 0.65, 0.85); //32_onverylow_2
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A0r), 3639.0, 2500.0, 5000.0, 0.75, 0.65); //32_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A2r), 5000.0, 3500.0, 7500.0, 0.75, 0.75); //32_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A4r), 7278.25, 4500.0, 18000.0, 0.65, 0.75); //32_onhigh
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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A6r), 2160.2, 500.0, 1500.0, 0.80, 0.95); //32_offidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A7r), 2462.8, 1000.0, 2500.0, 0.80, 0.95); //32_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A9r), 3913.5, 2000.0, 4000.0, 0.80, 0.95); //32_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005ABr), 5300.0, 3500.0, 5000.0, 0.75, 0.80); //32_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005ACr), 5946.3, 4500.0, 18000.0, 0.60, 0.80); //32_offhigh
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
