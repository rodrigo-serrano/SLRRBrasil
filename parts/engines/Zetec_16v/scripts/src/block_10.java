package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class block_10 extends Block_Inline_OHC
{
	public block_10( int id )
	{
		super( id );
		name = "Bloco motor Zetec (Zeta) 1.6 16v";
		description = "A Ford usou o nome Zetec para denominar uma variedade de Motores de quatro cilindros em linha para automóveis. Ele foi criado para substituir o nome Zeta na gama de motores 1.6 L a 2.0 L multi-valvulas lançados em 1991 porque a Ford estava sendo processada pela Lancia que era dona da marca Zeta.";

		value = 800;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(420000.0));

		bore = 79.0;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 147.66;
		crank_center_to_cylinder_top = 244.02;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(342.0);
		time_spark_inc	= sparkAngleTo4cycleTime(375.0)-time_spark_min;
		time_spark_RPM0	= 1500;
		time_spark_RPM1	= 7000;
		RPM_limit	= 8000;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000155r), 2000.0,  500.0, 2500.0, 0.5, 0.6);//onidle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000158r), 3000.0, 1000.0, 4000.0, 0.6, 0.7);//onverylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000157r), 6500.0, 2500.0, 5500.0, 0.7, 0.8);//onmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000154r), 8000.0, 4000.0, RPM_limit+600, 0.8, 0.9);//onhigh
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000014Er), 8500.0, RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                 if (dynodata.P_turbo_waste != 0)
				{
                                	tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000014Dr), 1500.0,   500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000153r), 3000.0,   700.0, 3500.0, 0.4, 0.5);//offverylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000151r), 4500.0,  2000.0, 5000.0, 0.5, 0.6);//offlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000152r), 6500.0,  3500.0, 6500.0, 0.6, 0.7);//offmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000014Fr), 8000.0,  5500.0, 18000.0, 0.7, 0.8);//offhigh
                                if (dynodata.P_turbo_waste != 0)
				{
						tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5500, 2500.0, 18000.0, 2.0, 3.0);//bov2
				}
                                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004EDr), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
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
