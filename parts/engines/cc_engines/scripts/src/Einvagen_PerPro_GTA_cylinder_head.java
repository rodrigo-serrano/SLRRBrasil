package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_cylinder_head extends DOHC_CylinderHead
{
	public Einvagen_PerPro_GTA_cylinder_head( int id )
	{
		super( id );
		name = "Volkswagen AT 1.0 16v cylinder head";
		description = "The stock head for the Volkswagen EA-113.";

		value = tHUF2USD(4*15+175);
		brand_new_prestige_value = 85.42;
		setMaxWear(kmToMaxWear(230000.0));

		intake_manifold_slot_ID = 27;
		exhaust_header_slot_ID = 49;
		camshaft_bearing_slot_ID = 31;
		cover_slot_ID = 29;

		exhaust_camshaft_slot_ID = 35;
		intake_camshaft_slot_ID = 33;

		intake_valve_diam = 39.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 38.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		intake_efficiency_tuning = 0.18;
		exhaust_efficiency_tuning = 0.18;

		cc_dome_safe_clearance = 0.0;

		maxRPM = 18000.0;
		inertia = kgToInertia(4*0.265);

		T_loss = 92.0;
		Vmin = 0.00; // in cc //
	}
}
