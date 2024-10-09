package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class bloco_2600 extends Block_Inline_OHV
{
	public bloco_2600( int id )
	{
		super( id );
		name = "Bloco Willys BF-161";
		description = "";

		value = 350;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 79.4;

		camshaft_slot_ID = 4;
		camshaft_bearing_slot_ID = 24;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 157.66;
		crank_center_to_cylinder_top = 317.00;

		rpm_idle = 600.0;
		time_spark_min	= sparkAngleTo4cycleTime(319.0);
		time_spark_inc	= sparkAngleTo4cycleTime(368.0)-time_spark_min;
		time_spark_RPM0	= 2000;
		time_spark_RPM1	= 4000;
		RPM_limit	= 5200;

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
			if (tab = the_car.getSfxTable(0))//S54 on
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E4r), 2500,   500.0, 2500.0, 0.5, 0.6);//onverylow1
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E0r), 4000,  1000.0, 4000.0, 0.6, 0.7);//onlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001E1r), 5000,  2500.0, 5500.0, 0.7, 0.8);//onmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001DEr), 6000,  4000.0, RPM_limit+600, 0.8, 0.9);//onhigh
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001D6r), 6500,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                 if (dynodata.P_turbo_waste != 0)
                                {
                                	tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 3.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//S54 off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001D5r), 1500,   500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001D8r), 2500,   700.0, 3500.0, 0.4, 0.5);//offidle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001D9r), 4525,  2000.0, 5000.0, 0.5, 0.6);//offlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001DAr), 5500,  3500.0, 6500.0, 0.6, 0.7);//offmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000001D7r), 6000,  5000.0, 18000.0, 0.7, 0.8);//offhigh
                                 if (dynodata.P_turbo_waste != 0)
                                 {
						tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5500, 2500.0, 18000.0, 2.7, 5.0);//bov2
				}
                                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F0r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
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
			return "O Motor esta sem Comando.";

		return super.isDynoable();
	}
}
