package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class bloco_renault_2000 extends Block_Inline_OHC
{
	public bloco_renault_2000( int id )
	{
		super( id );
		name = "Bloco Renault 2.0 F4R";
		description = "";

		value = 700;
		brand_new_prestige_value = 70.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 82.7;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 155.00;
		crank_center_to_cylinder_top = 230.00;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(323.0);
		time_spark_inc	= sparkAngleTo4cycleTime(355.0)-time_spark_min;
		time_spark_RPM0	= 2500;
		time_spark_RPM1	= 5700;
		RPM_limit	= 7000;

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
			float on = 0.3;
			float off= 0.1;
			if (tab = the_car.getSfxTable(0))
			{
				tab.clear();
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x0000000Cr), 3200,  500, 4800, 0.5+on, 0.6+on);//onverylow
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x0000000Ar), 3200, 3200, 7000, 0.6+on, 0.7+on);//onlow
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x0000000Br), 3200, 5000, 8500, 0.7+on, 0.8+on);//onmid
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000009r), 3200, 7000, 15000, 0.8+on, 1.0+on);//onhigh
				if (dynodata.P_turbo_waste > 0.0 )
				{	
					tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x0000000Er), 3200, 3300, RPM_limit+1200, 0.5+(dynodata.P_turbo_waste/2), 0.5+(dynodata.P_turbo_waste));//turbo_whine
				}
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000003r), 1000,  500,  3000, 0.3+off, 0.4+off);//idle
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000007r), 3200, 1300,  6000, 0.4+off, 0.5+off);//offlow
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000008r), 3200, 4500,  8300, 0.5+off, 0.6+off);//offmid
				tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000006r), 3200, 6500, 15000, 0.6+off, 0.9+off);//offhigh
				if (dynodata.P_turbo_waste > 0.0 )
				{
					tab.addItem(new ResourceRef(cars.racers.sandero_data.sounds:0x00000002r), RPM_limit-1800,  RPM_limit/2.3, RPM_limit+1000, (dynodata.P_turbo_waste/3), (dynodata.P_turbo_waste/2));//bov
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				the_car.setSfxExhaustMinVol(0.5);
			}
		}

		SFX_ignition = cars.racers.sandero_data.sounds:0x00000004r;
		sfx_starter_rpm = 900.0;

		Part car = getCarRef();
		if( car instanceof Chassis )
		{		
			((Chassis)car).SFX_ignition = SFX_ignition;
			((Chassis)car).sfx_starter_rpm = sfx_starter_rpm;

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
