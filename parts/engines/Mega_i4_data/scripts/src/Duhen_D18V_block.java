package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_D18V_block extends Block_Inline_OHC
{
	static int ST_INDIVIDUAL = -1;
	static int ST_EURO = 0;
	static int ST_LONG = 1;
	static int ST_JAPO = 2;
	int	setup_type = ST_INDIVIDUAL;

	public Duhen_D18V_block( int id )
	{
		super( id );
		name = "Ford Duratec HE 2.0 16v block";
		description = "This is strong to Ford Focus, Ecosport(European Fusion) and Ford Fiesta ST. Derived by Endura, It was a great engine, on Brazil in 2000 it was utilized on cars";

		value = tHUF2USD(42);
		brand_new_prestige_value = 55.70;
		setMaxWear(kmToMaxWear(240000.0));

		bore = 87.5;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 143.66;
		crank_center_to_cylinder_top = 223.81;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(332.0);
		time_spark_inc	= sparkAngleTo4cycleTime(376.5)-time_spark_min;
		time_spark_RPM0	= 2050;
		time_spark_RPM1	= 8800;
		RPM_limit	= 6800;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000006Cr), 3000,   500.0, 2000.0, 0.5, 0.6);//verylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000006Ar), 4000,  1000.0, 3500.0, 0.6, 0.7);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000006Br), 5500,  2000.0, 5000.0, 0.7, 0.8);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000068r), 7000,  3500.0, RPM_limit+600, 0.8, 0.9);//high
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000063r), 6250,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                 if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 4.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 2.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000062r), 1500,   500.0, 1250.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000067r), 3000,   750.0, 3500.0, 0.4, 0.5);//verylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000065r), 4000,  2000.0, 5000.0, 0.5, 0.6);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000066r), 5500,  3500.0, 6500.0, 0.6, 0.7);//mid				
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000064r), 7000,  5000.0, 18000.0, 0.7, 0.8);//high
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
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000010r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
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
