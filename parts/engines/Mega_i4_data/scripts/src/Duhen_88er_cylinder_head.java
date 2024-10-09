package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class Duhen_88er_cylinder_head extends DOHC_CylinderHead
{
	public Duhen_88er_cylinder_head( int id )
	{
		super( id );
		name = "Duratec HE 2.0 16v cylinder head";
		description = "";
		brand_new_prestige_value = 55.88;

		value = tHUF2USD(4*55+67);
		setMaxWear(kmToMaxWear(230000.0));

		intake_manifold_slot_ID = 27;
		exhaust_header_slot_ID = 49;
		camshaft_bearing_slot_ID = 31;
		cover_slot_ID = 29;

		exhaust_camshaft_slot_ID = 35;
		intake_camshaft_slot_ID = 33;

		intake_valve_diam = 31.01;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 27.05;
		number_of_exhaust_valves_per_cylinder = 2.0;

		intake_efficiency_tuning = 1.0;
		exhaust_efficiency_tuning = 1.0;

		cc_dome_safe_clearance = 0.0;

		maxRPM = 18000.0;
		inertia = kgToInertia(16*0.4);

		T_loss = 5.0;
		Vmin = 0.00; // in cc //
	}

}
