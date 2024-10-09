package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.cars.*;


public class vr_6_3_6_block extends Block_Inline_OHC
{
	public vr_6_3_6_block( int id )
	{
		super( id );
		name = "Bloco VW VR6 3.6";
		description = "";

		brand_new_prestige_value = 132.03;
		value = tHUF2USD(517.711);
		setMaxWear(kmToMaxWear(420000.0));

		bore = 90.0;

		crankshaft_slot_ID = 33;
		crankshaft_bearing_slot_ID = 41;
		cylinder_head_slot_ID = 19;
		transmission_slot_ID = 35;
		oil_pan_slot_ID = 31;

		cylinder_length_from_top = 177.44;
		crank_center_to_cylinder_top = 222.23;

		rpm_idle = 1500.0;
		time_spark_min	= sparkAngleTo4cycleTime(330.0);
		time_spark_inc	= sparkAngleTo4cycleTime(365.0)-time_spark_min;
		time_spark_RPM0	= 2500;
		time_spark_RPM1	= 9500;
		RPM_limit	= 10000;

		cylinders	= 6;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000AAr), 1442.48, 500.0, 2000.0, 0.65, 0.85); //32_onidle_1
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000ADr), 2289.8, 1500.0, 2500.0, 0.65, 0.85); //32_onverylow_1
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000AEr), 2610.6, 2000.0, 3500.0, 0.65, 0.85); //32_onverylow_2
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000ABr), 3639.0, 2500.0, 5000.0, 0.75, 0.65); //32_onlow
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000ACr), 5000.0, 3500.0, 7500.0, 0.75, 0.75); //32_onmid
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A8r), 7278.25, 4500.0, 18000.0, 0.65, 0.75); //32_onhigh
                                 if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 4.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 1.15)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000014r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.8)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000017r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A3r), 2160.2, 500.0, 1500.0, 0.80, 0.95); //32_offidle
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A7r), 2462.8, 1000.0, 2500.0, 0.80, 0.95); //32_offverylow
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A4r), 3913.5, 2000.0, 4000.0, 0.80, 0.95); //32_offlow
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A5r), 5300.0, 3500.0, 5000.0, 0.75, 0.80); //32_offmid
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A2r), 5946.3, 4500.0, 18000.0, 0.60, 0.80); //32_offhigh
                                if (dynodata.mixture_ratio < 9.0 )
						{	
							tab.addItem(new ResourceRef(EngineSoundPack:0x000004F5r), 5500.0, 4000.0, 12000.0, 3.0, 3.0); //BACKFIRE
						}				
                                  if(dynodata.P_turbo_max !=0.0)
				{
					if(dynodata.P_turbo_max == 4.00)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
					else if(dynodata.P_turbo_max == 1.15)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.0)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000012r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
                                        else if(dynodata.P_turbo_max == 2.8)
					tab.addItem(new ResourceRef(addon.Sounds.PureSound.General:0x00000015r), 5000, 2500.0, 18000.0, 2.0, 3.0);//spool
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.VR_6:0x000000A0r), 661.6,  100.0, 1250.0, 0.85, 0.85); //32_idle
				the_car.setSfxExhaustMinVol(0.6);
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 32 );
		if (!p)
			return "O Motor esta sem Alternador.";

                p = partOnSlot( 42 );
		if (!p)
			return "O Motor esta sem Junta De Cabecote.";

                p = partOnSlot( 43 );
		if (!p)
			return "O Motor esta sem Junta Do Carter.";

                p = partOnSlot( 44 );
		if (!p)
			return "O Motor esta sem Tampa Do Oleo.";

                p = partOnSlot( 45 );
		if (!p)
			return "O Motor esta sem Capa Inferior Da Corrente De Comando.";

                p = partOnSlot( 46 );
		if (!p)
			return "O Motor esta sem Filtro De Oleo.";

                p = partOnSlot( 47 );
		if (!p)
			return "O Motor esta sem Bomba De Agua.";

                p = partOnSlot( 48 );
		if (!p)
			return "O Motor esta sem Bomba De Oleo.";

                p = partOnSlot( 49 );
		if (!p)
			return "O Motor esta sem Polia.";

                p = partOnSlot( 50 );
		if (!p)
			return "O Motor esta sem Carcaca Da Valvula Termostatica.";

                p = partOnSlot( 51 );
		if (!p)
			return "O Motor esta sem Radiador De Oleo.";

		return super.isDynoable();
	}
}