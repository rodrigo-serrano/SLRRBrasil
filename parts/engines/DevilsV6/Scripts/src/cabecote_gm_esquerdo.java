package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_gm_esquerdo extends DOHC_CylinderHead
{
	public cabecote_gm_esquerdo( int id )
	{
		super( id );
		name = "Cabecote Esquerdo Motor V6 Chevrolet Alloytech";
		description = "";
		brand_new_prestige_value = 73.16;

		value = 3000;
		setMaxWear(kmToMaxWear(421000.0));

		intake_manifold_slot_ID = 0;
		exhaust_header_slot_ID = 37;
		camshaft_bearing_slot_ID = 28;
		cover_slot_ID = 22;

		exhaust_camshaft_slot_ID = 26;
		intake_camshaft_slot_ID = 25;

		intake_efficiency_tuning = 1.2;
		exhaust_efficiency_tuning = 1.1;

		intake_valve_diam = 37.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 30.7;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;

		T_loss = 75.0;
		Vmin = 86.26; // in cc //

		maxRPM = 20000.0;
		inertia = kgToInertia(4*0.55);

		check4warnings();
	}
}
