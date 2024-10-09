package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class block_SR extends Block_Inline_OHC
{
	public block_SR( int id )
	{
		super( id );
		name = "Bloco Volkswagen AP 1.6 SR Aluminio";
		description = "Stock Volkswagen EA827 engine block.";

		value = 400;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 81.0;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 124.66;
		crank_center_to_cylinder_top = 242.52;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(327.0);
		time_spark_inc	= sparkAngleTo4cycleTime(348.0)-time_spark_min;
		time_spark_RPM0	= 1800;
		time_spark_RPM1	= 6500;
		RPM_limit	= 7500;

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
