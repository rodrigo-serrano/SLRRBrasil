package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class SuperDuty_500_H4R_cylinder_head extends DOHC_CylinderHead
{
	public SuperDuty_500_H4R_cylinder_head( int id )
	{
		super( id );
		name = "Cabecote Direito Subaru EJ";
		description = "";
		brand_new_prestige_value = 73.16;

		value = 550;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 0;
		exhaust_header_slot_ID = 16;
		camshaft_bearing_slot_ID = 34;
		cover_slot_ID = 23;

		exhaust_camshaft_slot_ID = 32;
		intake_camshaft_slot_ID = 31;

		intake_efficiency_tuning = 1.35;
		exhaust_efficiency_tuning = 1.45;

		intake_valve_diam = 36.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 32.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 118.7;

		T_loss = 75.0;
		Vmin = 86.70; // in cc //

		inertia = kgToInertia(4*0.55);

		check4warnings();
	}

	
}
