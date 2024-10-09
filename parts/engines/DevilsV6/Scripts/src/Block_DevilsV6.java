package java.game.parts.engines.DevilsV6;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.osd.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;
import java.game.parts.bodypart.*;

public class Block_DevilsV6 extends Block_Vee_OHC
{
	int soundType	= 2;
	int turboType	= 0;
	int transType	= 0;
	float turborpm	= 3500;
	static int ENGINESND_DEVILSV6_350Z	= 0;
	static int ENGINESND_DEVILSV6_NSX	= 1;
	static int ENGINESND_DEVILSV6_GTR	= 2;
	static int ENGINESND_DEVILSV6_TER	= 3;
	static int ENGINESND_DEVILSV6_AUDITT	= 4;
	static int ENGINESND_DEVILSV6_CAPRI	= 5;
	static int ENGINESND_DEVILSV6_Z4	= 6;

	public Block_DevilsV6( int id )
	{
		super( id );
		
		check4warnings();
	}
	
	public void load( File saveGame )
	{
		super.load( saveGame );

		int	save_ver = saveGame.readInt();

		if (save_ver >= 1)
		{
			soundType = saveGame.readInt();
		}
	}

	public void save( File saveGame )
	{
		super.save( saveGame );

		int	save_ver = 2;

		saveGame.write( save_ver );
		if (save_ver >= 1)
		{
			saveGame.write( soundType );
		}
	}
	
	public int getSoundType()
	{
		return soundType;
	}
	
	public void setSoundType(int newST)
	{
		soundType = newST;
	}
	
	public void getTurboType()
	{
		Part lch = getLeftCylinderHead();
		Part rch = getRightCylinderHead();
		
		if (rch && lch)
		{
			Part lexh = lch.getExhaustHeader();
			Part rexh = rch.getExhaustHeader();
			
			if (rexh)
			{
				Part rturbo = rexh.partOnSlot(151);
				if (rturbo)
				{
					turboType = 2;
				}
				else
				{
					turboType = 1;
				}
			}
			else if (lexh)
			{
				Part lturbo = lexh.partOnSlot(150);
				if (lturbo)
				{
					turboType = 2;
				}
				else
				{
					turboType = 1;
				}
			}
			else
			{
				turboType = 1;
			}
		}
		else
		{
			turboType = 0;
		}
	}

	//public void getTransType()
	//{
		//Part trans = getTransmission();
		//if (trans instanceof DevilsV6_Pro_transmission || trans instanceof DevilsV6_RS_transmission)
		//{
			//transType = 1;
		//}
		//transType = 0;
	//}
	
	public void updatevariables()
	{
		getCar_LocalVersion();
		
		super.updatevariables();
		getTurboType();
		//getTransType();
		
		if (the_car)
		{
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))
			{
				tab.clear();

				if (soundType == ENGINESND_DEVILSV6_350Z)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000009Er), 2133.3, 500.0, 2000.0, 0.65, 0.85); //350z_onverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000A0r), 3200.0, 1500.0, 4000.0, 0.75, 0.75); //350z_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000A2r), 4800.0, 3000.0, 6000.0, 0.65, 0.75); //350z_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000A4r), 6408.0, 5000.0, 18000.0, 0.75, 0.75); //350z_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_NSX)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000029Er), 2521.0, 500.0, 2000.0, 0.65, 0.85); //nsx_onidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000029Fr), 3000.0, 500.0, 2000.0, 0.65, 0.85); //nsx_onverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A0r), 4000.0, 1500.0, 3500.0, 0.75, 0.85); //nsx_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A2r), 6000.0, 3000.0, 6000.0, 0.75, 0.75); //nsx_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A4r), 8000.0, 5000.0, 18000.0, 0.75, 0.75); //nsx_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_GTR)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000039Er), 3217.5*1.35, 500.0, 2000.0, 0.65, 0.85); //gtr_onidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A0r), 4762.0*1.35, 1500.0, 3500.0, 0.75, 0.85); //gtr_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A2r), 4000.0*1.35, 3000.0, 6000.0, 0.75, 0.75); //gtr_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A4r), 5240.0*1.35, 4500.0, 18000.0, 0.65, 0.75); //gtr_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_TER)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000049Er), 2100.0, 500.0, 2000.0, 0.55, 0.75); //ter_onverylow_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000049Fr), 3150.0, 500.0, 2000.0, 0.55, 0.75); //ter_onverylow_2
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A0r), 3968.3, 1500.0, 3500.0, 0.65, 0.75); //ter_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A2r), 5000.0, 3000.0, 6000.0, 0.55, 0.65); //ter_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A4r), 7071.0, 5000.0, 18000.0, 0.65, 0.65); //ter_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_AUDITT)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000059Er), 1442.48, 500.0, 2000.0, 0.65, 0.85); //32_onidle_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000059Fr), 2289.8, 1500.0, 2500.0, 0.65, 0.85); //32_onverylow_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x00000540r), 2610.6, 2000.0, 3500.0, 0.65, 0.85); //32_onverylow_2
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A0r), 3639.0, 2500.0, 5000.0, 0.75, 0.65); //32_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A2r), 5000.0, 3500.0, 7500.0, 0.75, 0.75); //32_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A4r), 7278.25, 4500.0, 18000.0, 0.65, 0.75); //32_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_CAPRI)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000069Er), 2520.5, 500.0, 2500.0, 0.65, 0.85); //capri_onverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006A0r), 4000.0, 2500.0, 3500.0, 0.75, 0.85); //capri_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006A2r), 6000.0, 3000.0, 6000.0, 0.75, 0.75); //capri_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006A4r), 7032.0, 5000.0, 18000.0, 0.75, 0.75); //capri_onhigh
				}
				if (soundType == ENGINESND_DEVILSV6_Z4)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000079Er), 2882.0, 500.0, 2000.0, 0.55, 0.75); //z4_onidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000079Fr), 3330.0, 1500.0, 3000.0, 0.55, 0.75); //z4_onverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007A0r), 4710.0, 2500.0, 4500.0, 0.65, 0.75); //z4_onlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007A2r), 5600.0, 3500.0, 6500.0, 0.65, 0.65); //z4_onmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007A4r), 7056.0, 5000.0, 18000.0, 0.65, 0.65); //z4_onhigh
				}
				
				if (dynodata.P_turbo_max > 0.0)
				{
					if (this.turboType == 2)
					{
						turborpm = 6000*(dynodata.RPM_limit/9000);
						tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005B1r), 1500.0, 800.0, (dynodata.RPM_limit/2.5), 0.0, 0.15); //turbo_hiss_1
						tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005B1r), 1500.0, (dynodata.RPM_limit/2.5), dynodata.RPM_limit, 0.15, 0.05); //turbo_hiss_1
						tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006B1r), 1500.0, 800.0, (dynodata.RPM_limit/2), 0.15, 0.45); //turbo_whine_1	
						tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006B1r), 1500.0, (dynodata.RPM_limit/2), 12000.0, 0.45, 0.35); //turbo_whine_1
					}
				}
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();

				if (soundType == ENGINESND_DEVILSV6_350Z)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000A9r), 3200.0, 500.0, 4000.0, 0.80, 0.95); //350z_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000ABr), 4800.0, 3500.0, 7000.0, 0.75, 0.85); //350z_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000ACr), 6408.0, 5000.0, 18000.0, 0.60, 0.80); //350z_offhigh
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000AEr), 7120.0, 3500.0, 8000.0, 0.00, 1.00); // 350z_offrumble
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000AEr), 7120.0, 8000.0, 18000.0, 1.00, 1.00); // 350z_offrumble
				}
				if (soundType == ENGINESND_DEVILSV6_NSX)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002A9r), 4000.0, 500.0, 4000.0, 0.80, 0.95); //nsx_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002ABr), 6000.0, 3500.0, 6500.0, 0.75, 0.85); //nsx_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002ACr), 6896.6, 4000.0, 18000.0, 0.50, 0.80); //nsx_offhigh
				}
				if (soundType == ENGINESND_DEVILSV6_GTR)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A7r), 4492.4*1.35, 500.0, 2000.0, 0.90, 1.00); //gtr_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003A9r), 4762.0*1.35, 1500.0, 4000.0, 0.90, 1.00); //gtr_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003ABr), 4000.0*1.35, 3500.0, 6500.0, 0.75, 0.85); //gtr_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003ACr), 5240.0*1.35, 4000.0, 18000.0, 0.50, 0.80); //gtr_offhigh
				}
				if (soundType == ENGINESND_DEVILSV6_TER)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A6r), 2103.7, 500.0, 2000.0, 0.80, 0.90); //ter_offverylow_1
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A7r), 2971.7, 1500.0, 3000.0, 0.80, 0.90); //ter_offverylow_2
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004A9r), 3856.5, 2500.0, 4000.0, 0.80, 0.90); //ter_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004ABr), 4860.0, 3500.0, 6500.0, 0.65, 0.75); //ter_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000004ACr), 6871.7, 5500.0, 18000.0, 0.60, 0.70); //ter_offhigh
				}
				if (soundType == ENGINESND_DEVILSV6_AUDITT)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A6r), 2160.2, 500.0, 1500.0, 0.80, 0.95); //32_offidle
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A7r), 2462.8, 1000.0, 2500.0, 0.80, 0.95); //32_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005A9r), 3913.5, 2000.0, 4000.0, 0.80, 0.95); //32_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005ABr), 5300.0, 3500.0, 5000.0, 0.75, 0.80); //32_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005ACr), 5946.3, 4500.0, 18000.0, 0.60, 0.80); //32_offhigh
				//	tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005AEr), 7278.25, 6000.0, 9000.0, 0.40, 0.80); // 32_offveryhigh
				//	tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000005AEr), 7278.25, 9000.0, 18000.0, 0.80, 0.80); // 32_offveryhigh
				}
				if (soundType == ENGINESND_DEVILSV6_CAPRI)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006A7r), 2520.5, 500.0, 2000.0, 0.90, 1.00); //capri_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006A9r), 4000.0, 1500.0, 4000.0, 0.90, 1.00); //capri_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006ABr), 6000.0, 3500.0, 6500.0, 0.75, 0.85); //capri_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000006ACr), 7032.0, 5500.0, 18000.0, 0.50, 0.80); //capri_offhigh
				}
				if (soundType == ENGINESND_DEVILSV6_Z4)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007A7r), 3330.0, 500.0, 2500.0, 0.90, 1.00); //z4_offverylow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007A9r), 4710.0, 1500.0, 4000.0, 0.90, 1.00); //z4_offlow
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007ABr), 5600.0, 3500.0, 6500.0, 0.65, 0.75); //z4_offmid
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000007ACr), 7056.0, 5000.0, 18000.0, 0.65, 0.65); //z4_offhigh
				}
				
				if (dynodata.P_turbo_max > 0.0)
				{
					if (this.turboType == 2)
					{
						if (dynodata.P_turbo_waste > 0.90)
							tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000002B1r), 8000.0, (dynodata.RPM_limit*2/3), 12000.0, 1.75, 2.55); //wastegate_single_high
						else
							tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000000B1r), 8000.0, (dynodata.RPM_limit*2/3), 12000.0, 1.75, 2.55); //wastegate_single_low
					}
				}
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				if (soundType == ENGINESND_DEVILSV6_350Z)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000009Dr), 1798.0,  100.0, 1250.0, 0.85, 0.85); //350z_idle
				}
				if (soundType == ENGINESND_DEVILSV6_NSX)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000029Dr), 2000.8,  100.0, 1250.0, 0.85, 0.85); //nsx_idle
				}
				if (soundType == ENGINESND_DEVILSV6_GTR)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000039Dr), 1807.6*1.35,  100.0, 1250.0, 0.95, 0.95); //gtr_idle
				}
				if (soundType == ENGINESND_DEVILSV6_TER)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000049Dr), 1485.0,  100.0, 1250.0, 0.75, 0.75); //ter_idle
				}
				if (soundType == ENGINESND_DEVILSV6_AUDITT)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000059Dr), 661.6,  100.0, 1250.0, 0.85, 0.85); //32_idle
				}
				if (soundType == ENGINESND_DEVILSV6_CAPRI)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000069Dr), 1680.3,  100.0, 1250.0, 0.85, 0.85); //capri_idle
				}
				if (soundType == ENGINESND_DEVILSV6_Z4)
				{
					tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x0000079Dr), 1921.4,  100.0, 1250.0, 0.85, 0.85); //z4_idle
				}
				if (dynodata.P_turbo_waste >= 0.5)
				{
					if (this.turboType == 1)
					{
						tab.addItem(new ResourceRef(parts.engines.DevilsV6:0x000003B1r), 2000.0, 800.0, 12000.0, 0.70, 0.80); //supercharger
					}
				}

				the_car.setSfxExhaustMinVol(0.8);
			}
			
			//int SFX_trans_fwd	= sound:0x00000007r;
			//int SFX_trans_rev	= sound:0x00000009r;
			//float rpm_trans_fwd	= 1400.0;
			//float rpm_trans_rev	= 1400.0;
			
			//if (transType == 1)
			//{
				//SFX_trans_fwd = parts.engines.DevilsV6:0x000007B1r;
				//rpm_trans_fwd = 1000.0;
				
				//SFX_trans_rev = parts.engines.DevilsV6:0x000007B1r;
				//rpm_trans_rev = 1000.0;
			//}
			//else
			//{
				//SFX_trans_fwd	= sound:0x00000007r;
				//SFX_trans_rev	= sound:0x00000009r;
				//rpm_trans_fwd = 1400.0;
				//rpm_trans_rev = 1400.0;
			//}
			
			//Part car = getCarRef();
			//if( car instanceof Chassis )
			//{
				//the_car.SFX_trans_fwd = SFX_trans_fwd;
				//the_car.rpm_trans_fwd = rpm_trans_fwd;
				//the_car.SFX_trans_rev = SFX_trans_rev;
				//the_car.rpm_trans_rev = rpm_trans_rev;
			//}
		}
	}
}
