package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco_std extends Block_Vee_OHV
{
	public bloco_std( int id )
	{
		super( id );
		name = "Bloco Ford 302 Medida STD";
		description = "";

		brand_new_prestige_value = 45;
		value = 8500;
		setMaxWear(kmToMaxWear(720000.0));

		bore = 101.6;

		cylinder_length_from_top = 138.55;
		crank_center_to_cylinder_top = 222.500;

		camshaft_slot_ID = 26;

		crankshaft_slot_ID = 8;
		transmission_slot_ID = 5;
		oil_pan_slot_ID = 9;

		L_cylinder_head_slot_ID = 45;
		R_cylinder_head_slot_ID = 46;
		intake_manifold_slot_ID = 14;

		rpm_idle = 700.0;
		time_spark_min	= sparkAngleTo4cycleTime(325.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 2500;
		time_spark_RPM1	= 5750;
		RPM_limit	= 8000;

		cylinders	= 8;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003EAr), 2000,   500.0, 2500.0, 0.5, 0.6);//onidle
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003EBr), 3500,  1000.0, 4000.0, 0.6, 0.7);//onlow
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003ECr), 5000,  2500.0, 5500.0, 0.7, 0.8);//onmid
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E9r), 7000,  4000.0, RPM_limit+600, 0.8, 0.9);//onhigh
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E4r), 8000,  RPM_limit-600, 18000.0, 0.9, 0.9);//limiter
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000018r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.16)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool        
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E3r), 1000,   500.0, 1200.0, 0.3, 0.4);//idle			
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E8r), 3500,   700.0, 3500.0, 0.4, 0.5);//offverylow	
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E6r), 4525,  2000.0, 5000.0, 0.5, 0.6);//offlow		
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E7r), 5000,  3500.0, 6500.0, 0.6, 0.7);//offmid	
				tab.addItem(new ResourceRef(EngineSoundPack:0x000003E5r), 7000,  5000.0, 18000.0, 0.7, 0.8);//offhigh	
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F3r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 3.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F18r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.16)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F19r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool        
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				the_car.setSfxExhaustMinVol(0.1);
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 32 );
		if (!p)
			return "O Motor esta sem Alternador.";

		p = partOnSlot( 90 );
		if (!p)
			return "O Motor esta sem Ignicao.";

		p = partOnSlot( 91 );
		if (!p)
			return "O Motor esta sem Frente.";

		return super.isDynoable();
	}
}
