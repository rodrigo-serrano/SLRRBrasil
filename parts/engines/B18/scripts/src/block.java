package java.game.parts.engines.B18;

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
		name = "Bloco Motor Honda B16";
		description = "";

		value = 1000;
		brand_new_prestige_value = 70.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 81.0;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 170.44;
		crank_center_to_cylinder_top = 215.00;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(323.0);
		time_spark_inc	= sparkAngleTo4cycleTime(355.0)-time_spark_min;
		time_spark_RPM0	= 1550;
		time_spark_RPM1	= 6550;
		RPM_limit	= 8500;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A6r), 3000.0,  500.0, 2500.0, 0.5, 0.6);//onverylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A4r), 4000.0, 1000.0, 4000.0, 0.6, 0.7);//onlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A5r), 6000.0, 2500.0, 5500.0, 0.7, 0.8);//onmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A2r), 8000.0, 4000.0, RPM_limit+600.0, 0.8, 0.9);//onhigh
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000009Dr), 8600.0, RPM_limit-600.0, 18000.0, 0.9, 0.9);//limiter
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.51)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000009Cr),  800.0,  500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A1r), 1650.0,  700.0, 3500.0, 0.4, 0.5);//offverylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000000A0r), 3000.0, 2000.0, 6500.0, 0.5, 0.6);//offlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000009Er), 6000.0, 5000.0, 18000.0, 0.6, 0.7);//offhigh
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004EBr), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 2.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				        else if(dynodata.P_turbo_max == 2.51)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000011r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
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

		p = partOnSlot( 32 );
		if (!p)
			return "O Motor esta sem Alternador.";

		return super.isDynoable();
	}
}
