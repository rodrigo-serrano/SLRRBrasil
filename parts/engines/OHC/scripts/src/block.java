package java.game.parts.engines.OHC;

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
		name = "Bloco OHC ";
		description = "";

		value = tHUF2USD(63.469);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(250000.0));

		bore = 77.0;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 137.66;
		crank_center_to_cylinder_top = 232.65;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(319.0);
		time_spark_inc	= sparkAngleTo4cycleTime(368.0)-time_spark_min;
		time_spark_RPM0	= 1250;
		time_spark_RPM1	= 6000;
		RPM_limit	= 5200;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
			SFX_ignition = parts.engines.OHC:0x00000F5Cr;
			SfxTable tab;
                        if (tab = the_car.getSfxTable(0))//on
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000017Er), 2000,   500.0, 3000.0, 0.5, 0.6);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000017Fr), 4000,  1000.0, 4000.0, 0.6, 0.7);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000180r), 6000,  2500.0, 12000.0, 0.7, 0.8);//mid
                                tab.addItem(new ResourceRef(EngineSoundPack:0x0000017Dr), 12000.0,  12000.0, 18000.0, 0.8, 0.9);//high
                                if (dynodata.P_turbo_waste != 0)
				{
                                	tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000177r), 1000,   500.0, 3000.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000017Ar), 4000,   750.0, 4000.0, 0.4, 0.5);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000017Br), 6000,  2500.0, 12000.0, 0.5, 0.6);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000179r), 12000.0, 12000.0, 18000.0, 0.6, 0.7);//high
                                if (dynodata.P_turbo_waste != 0)
				{
						tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5500, 2500.0, 18000.0, 2.0, 3.0);//bov2
				}
                                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004FFr), 5500.0, 4000.0, 12000.0, 13.0, 13.0); //BACKFIRE
						}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				the_car.setSfxExhaustMinVol(0.9);

			}
		}
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();
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
