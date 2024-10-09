package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_audi_direito extends DOHC_CylinderHead
{
	public cabecote_audi_direito( int id )
	{
		super( id );
		name = "Cabecote Esquerdo Motor V6 Audi 30v";
		description = "";
		brand_new_prestige_value = 73.16;

		value = 3000;
		setMaxWear(kmToMaxWear(421000.0));

		intake_manifold_slot_ID = 0;
		exhaust_header_slot_ID = 16;
		camshaft_bearing_slot_ID = 34;
		cover_slot_ID = 23;

		exhaust_camshaft_slot_ID = 32;
		intake_camshaft_slot_ID = 31;

		intake_efficiency_tuning = 1.0;
		exhaust_efficiency_tuning = 0.9;

		intake_valve_diam = 27.0;
		number_of_intake_valves_per_cylinder = 3.0;
		exhaust_valve_diam = 29.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;

		T_loss = 75.0;
		Vmin = 86.26; // in cc //

		maxRPM = 20000.0;
		inertia = kgToInertia(4*0.55);

		check4warnings();
	}
}
