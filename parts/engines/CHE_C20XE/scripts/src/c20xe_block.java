package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;
import java.game.parts.bodypart.*;

public class c20xe_block extends Block_Inline_OHC
{
	static int SFX_TRANS_1 = parts.engines.CHE_C20XE.sounds:0x00000012r;//transmission_1
	static int SFX_TRANS_2 = parts.engines.CHE_C20XE.sounds:0x00000013r;//transmission_2
	
	int SFX_TRANS_ON = 0;
	int SFX_TRANS_OFF = 0;
	
	static int SFX_BLOWOFF_1 = parts.engines.CHE_C20XE.sounds:0x00000003r;//bov_1
	static int SFX_BLOWOFF_2 = parts.engines.CHE_C20XE.sounds:0x00000004r;//bov_2
	
	int SFX_BLOWOFF = 0;
	
	public c20xe_block( int id )
	{
		super( id );
		name = "C20XE block";
		description = "";

		value = 2000;
		brand_new_prestige_value = 55.70;
		setMaxWear(kmToMaxWear(300000.0));

		redlineRecTexts[0] = " Otimo";
		redlineRecTexts[1] = " Muito Alto";
		redlineRecTexts[2] = " Perdendo Potencia";

		idleRecTexts[0] = " Otimo";
		idleRecTexts[1] = " Muito Baixo";
		
		bore = 93.0001;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 120.2;
		crank_center_to_cylinder_top = 239.1;

		rpm_idle = 950;
		time_spark_min	= sparkAngleTo4cycleTime(321.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 4000;
		time_spark_RPM1	= 8000;

		RPM_limit	= 7500;

		cylinders	= 4;

		check4warnings();
	}
	
	public void setSFXs()
	{
		Part Transmission = this.partOnSlot(this.transmission_slot_ID);

		if(Transmission)
		{
			if (dynodata.P_turbo_waste > 0.01)
			{
				SFX_TRANS_ON = 0;
				SFX_TRANS_OFF = 0;
			}else
				SFX_TRANS_ON = SFX_TRANS_2;
				SFX_TRANS_OFF = SFX_TRANS_1;
		}
		
		if(SFX_BLOWOFF == 0)
		{
			if(dynodata.P_turbo_waste > 1.01)
			{
				SFX_BLOWOFF = SFX_BLOWOFF_1;
			}else
			if(dynodata.P_turbo_waste <= 1.0)
			{
				SFX_BLOWOFF = SFX_BLOWOFF_2;
			}
		}
	}

	public void updatevariables()
	{
		getCar_LocalVersion();
		
		super.updatevariables();
		
		dynodata.cylinders	= 4;
		
		setSFXs();
		
		if (the_car)
		{
			float on = 0.2;
			float off = 0.1;
			float pitch = 0.0;
					
			SfxTable tab;
			
			if (tab = the_car.getSfxTable(0))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Dr), 2000+pitch,  500, 2300, 0.4+on, 0.5+on);//onidle
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000010r), 3000+pitch, 1600, 3950, 0.5+on, 0.6+on);//onverylow
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Er), 5000+pitch, 3000, 5600, 0.6+on, 0.7+on);//onlow
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Fr), 6000+pitch, 4700, 6990, 0.7+on, 0.8+on);//onmid
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Cr), 7000+pitch, 6200, RPM_limit+600, 0.8+on, 0.9+on);//onhigh
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000007r), 8000+pitch, RPM_limit-600, 18000.0, 0.9, 1.0);//limiter
				if (dynodata.P_turbo_waste > 0.0)
				{
					tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000014r), 4000, 3330, RPM_limit+1000, 0.35+(dynodata.P_turbo_waste/2), 0.35+(dynodata.P_turbo_waste/1.5)); //turbo_whine
				}
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000005r), 1300+pitch,  500, 2150, 0.4+off, 0.5+off);//idle
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Br), 2000+pitch, 1400, 3200, 0.5+off, 0.6+off);//offverylow
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000009r), 3500+pitch, 2500, 4600, 0.6+off, 0.7+off);//offlow
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x0000000Ar), 5000+pitch, 3700, 6000, 0.7+off, 0.8+off);//offmid
				tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000008r), 6000+pitch, 5300, RPM_limit+1200, 0.8+off, 0.9+off);//offhigh
			//	tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000001r), 6000, 4000, 7800, 2.0, 2.0); // backfire_1
			//	tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000002r), 4500, 3600, 5000, 2.0, 2.0); // backfire_2
			//	tab.addItem(new ResourceRef(parts.engines.CHE_C20XE.sounds:0x00000011r), 5000, 3000, 7000, 0.5, 1.5); // rumble
				if (dynodata.P_turbo_waste > 0.0)
				{
					tab.addItem(new ResourceRef(SFX_BLOWOFF), 6500, RPM_limit/2.3, RPM_limit+600, 0.35+(dynodata.P_turbo_waste/2), 0.35+(dynodata.P_turbo_waste/1.5)); //bov_1
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();					
				the_car.setSfxExhaustMinVol(0.1);
			}
		}
		
		SFX_ignition = parts.engines.CHE_C20XE.sounds:0x00000006r;
		sfx_starter_rpm = 900.0;

		SFX_trans_fwd =SFX_TRANS_ON;
		rpm_trans_fwd = 2000.0;

		SFX_trans_rev =SFX_TRANS_OFF;
		rpm_trans_rev = 2000.0;

		Part car = getCarRef();
		if( car instanceof Chassis )
		{
			
			((Chassis)car).SFX_trans_fwd = SFX_trans_fwd;
			((Chassis)car).rpm_trans_fwd = rpm_trans_fwd;
			
			((Chassis)car).SFX_trans_rev = SFX_trans_rev;
			((Chassis)car).rpm_trans_rev = rpm_trans_rev;
			
			((Chassis)car).SFX_ignition = SFX_ignition;
			((Chassis)car).sfx_starter_rpm = sfx_starter_rpm;

		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 14 );
		if (!p)
			return "O Motor esta sem Alternador.";

		return super.isDynoable();
	}
}