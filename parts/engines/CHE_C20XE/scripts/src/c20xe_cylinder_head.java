package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class c20xe_cylinder_head extends DOHC_CylinderHead
{
	public c20xe_cylinder_head( int id )
	{
		super( id );
		name = "C20XE cylinder head";
		description = "";

		value = tHUF2USD(4*5+65);
		brand_new_prestige_value = 85.42;
		setMaxWear(kmToMaxWear(230000.0));

		intake_manifold_slot_ID = 27;
		exhaust_header_slot_ID = 49;
		camshaft_bearing_slot_ID = 31;
		cover_slot_ID = 29;

		exhaust_camshaft_slot_ID = 35;
		intake_camshaft_slot_ID = 33;

		intake_valve_diam = 26.5;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 25.7;
		number_of_exhaust_valves_per_cylinder = 2.0;
		
		intake_efficiency_tuning = 0.75;
		exhaust_efficiency_tuning = 0.75;

		cc_dome_safe_clearance = 0.0;

		maxRPM = 18000.0;
		inertia = kgToInertia(4*0.3);

		T_loss = 80.0;
		Vmin = 0.00; // in cc //
	}
}