package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Bloco_2200 extends Block_Vee_OHV
{
	public Bloco_2200( int id )
	{
		super( id );
		name = "Bloco Motor Fusca 94mm";
		description = "O Motor boxer de 4 cilindros foi desenvolvido por Ferdinand Porsche no periodo da Segunda Guerra Mundial, a pedido de Hitler, pois ele queria um motor rustico e duravel que nao necessitasse de agua. Foi, assim, refrigerado a ar. Equipou o Volkswagen Sedan conhecido como Fusca e alguns modelos da Porsche. Este motor pode ser encontrado em ultraleves com a adaptacao de um kit para aumentar a segurança. Atualmente a Volkswagen encerrou a utilizacao deste motor por ser altamente poluente e ter um alto consumo de combustivel.";

		brand_new_prestige_value = 45;
		value = 5000;
		setMaxWear(kmToMaxWear(720000.0));

		bore = 94.0;

		cylinder_length_from_top = 113.43;
		crank_center_to_cylinder_top = 200.00;

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
		time_spark_RPM0	= 1500;
		time_spark_RPM1	= 7550;
		RPM_limit	= 8500;

		cylinders	= 4;

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
        		{
        			tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000B1r), 3420, 500, 4830, 0.7, 0.8);//onLowTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000B3r), 4830, 3420, 6060, 0.8, 0.9);//onMidTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000AFr), 6060, 4830, RPM_limit+600, 0.9, 1.0);//onHighTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A7r), 6900, RPM_limit-600, 18000, 1.0, 1.0);//limiterTuned
        		}

				if (dynodata.P_turbo_waste > 0.0)
					tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000B4r), 4000, 2330, RPM_limit+1000, 0.35+(dynodata.P_turbo_waste/2), 0.35+(dynodata.P_turbo_waste/1.5)); //turboWhine
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
        		{
        			tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A5r), 975, 500, 3660, 0.6, 0.7);//idleTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000ABr), 3660, 975, 4065, 0.7, 0.8);//offLowTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000ADr), 4065, 3660, 6060, 0.8, 0.9);//offMidTuned
	        		tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A9r), 6300, 4065, RPM_limit+600, 0.9, 1.0);//offHighTuned
        		}

				tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A0r), RPM_limit/2,  RPM_limit/4, RPM_limit, 0.4, 0.8); // backfire_1
				if (dynodata.mixture_ratio < 9.0 )
					tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A1r), RPM_limit/1.5,  RPM_limit/2, RPM_limit, 0.6, 1.2); // backfire_2

				if(dynodata.P_turbo_waste > 0.0)
				{
					tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A2r), RPM_limit/1.5, RPM_limit/4.5, RPM_limit+600, 0.35+(dynodata.P_turbo_waste/2), 0.35+(dynodata.P_turbo_waste/1.5)); //bov_1
					tab.addItem(new ResourceRef(parts.engines.Boxer_fusca:0x000000A3r), RPM_limit-600, RPM_limit-1200, RPM_limit+600, 0.5+(dynodata.P_turbo_waste/2), 0.5+(dynodata.P_turbo_waste/1.5)); // bov_2
				}
			}
			
			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
			}

		}
	}
}