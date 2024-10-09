package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bloco extends Block_Vee_OHV
{
	public bloco( int id )
	{
		super( id );
		name = "Bloco Motor Dodge 318 V8";
		description = "";

		brand_new_prestige_value = 50.05;
		value = 5000;
		setMaxWear(kmToMaxWear(500000.0));

		bore = 99.1;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 257.00;

		camshaft_slot_ID = 10;

		crankshaft_slot_ID = 8;
		transmission_slot_ID = 5;
		oil_pan_slot_ID = 9;

		L_cylinder_head_slot_ID = 45;
		R_cylinder_head_slot_ID = 46;
		intake_manifold_slot_ID = 14;

		rpm_idle = 1200.0;
		time_spark_min	= sparkAngleTo4cycleTime(330.0);
		time_spark_inc	= sparkAngleTo4cycleTime(335.0)-time_spark_min;
		time_spark_RPM0	= 1500;
		time_spark_RPM1	= 4000;
		RPM_limit	= 6250;

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
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000316r), 2575,   500.0, 2500.0, 0.5, 0.6);//verylow
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000314r), 4050,  1000.0, 4000.0, 0.6, 0.7);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000315r), 4200,  2500.0, 5500.0, 0.7, 0.8);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000312r), 6850,  4000.0, RPM_limit+600.0, 0.8, 0.9);//high
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000030Dr), 8000,  RPM_limit-600.0, 18000.0, 0.9, 0.9);//limiter
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 7.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000018r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.16)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000019r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool        
				}
			}

			if (tab = the_car.getSfxTable(1))//off
			{
				tab.clear();
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000030Cr), 1000,   500.0, 1200.0, 0.3, 0.4);//idle
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000030Fr), 3200,   700.0, 4000.0, 0.4, 0.5);//low
				tab.addItem(new ResourceRef(EngineSoundPack:0x00000310r), 4700,  2500.0, 5500.0, 0.5, 0.6);//mid
				tab.addItem(new ResourceRef(EngineSoundPack:0x0000030Er), 7000,  4000.0, 18000.0, 0.6, 0.7);//high
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F3r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}
                                if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 7.5)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000F18r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 1.16)
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
			return "Falta o Alternador!";

		p = partOnSlot( 56 );
		if (!p)
			return "Falta a Corrente de Comando.";

		p = partOnSlot( 55 );
		if (!p)
			return "Falta o Filtro de Oleo.";

		p = partOnSlot( 56 );
		if (!p)
			return "Falta a Tampa de Corrente Comando.";

		p = partOnSlot( 57 );
		if (!p)
			return "Falta a Bomba De Agua.";

		p = partOnSlot( 59 );
		if (!p)
			return "Falta o Distribuidor.";


		return super.isDynoable();
	}

	public String isDriveable()
	{
		Part p;

		p = partOnSlot( 20 );
		if (!p)
			return "Falta o Alternador!";

		p = partOnSlot( 56 );
		if (!p)
			return "Falta a Corrente de Comando.";

		p = partOnSlot( 55 );
		if (!p)
			return "Falta o Filtro de Oleo.";

		p = partOnSlot( 56 );
		if (!p)
			return "Falta a Tampa de Corrente Comando.";

		p = partOnSlot( 57 );
		if (!p)
			return "Falta a Bomba De Agua.";

		p = partOnSlot( 59 );
		if (!p)
			return "Falta o Distribuidor.";

		return super.isDriveable();
	}
}