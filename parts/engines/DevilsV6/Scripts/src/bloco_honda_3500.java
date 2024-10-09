package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco_honda_3500 extends Block_DevilsV6
{
	public bloco_honda_3500( int id )
	{
		super( id );
		name = "Bloco Motor V6 Honda 3.5 J35";
		description = "";

		brand_new_prestige_value = 69.86;
		value = 2500;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 89.00;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 272.50;

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
		time_spark_RPM0	= 4900;
		time_spark_RPM1	= 6200;
		RPM_limit	= 8000;

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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000029Er), 2521.0, 500.0, 2000.0, 0.65, 0.85); //nsx_onidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000029Fr), 3000.0, 500.0, 2000.0, 0.65, 0.85); //nsx_onverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A0r), 4000.0, 1500.0, 3500.0, 0.75, 0.85); //nsx_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A2r), 6000.0, 3000.0, 6000.0, 0.75, 0.75); //nsx_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A4r), 8000.0, 5000.0, 18000.0, 0.75, 0.75); //nsx_onhigh
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
				tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A9r), 4000.0, 500.0, 4000.0, 0.80, 0.95); //nsx_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002ABr), 6000.0, 3500.0, 6500.0, 0.75, 0.85); //nsx_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002ACr), 6896.6, 4000.0, 18000.0, 0.50, 0.80); //nsx_offhigh
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
