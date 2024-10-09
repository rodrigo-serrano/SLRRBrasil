package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class Shimutshibu_RC_DDSB8C_cylinder_head extends DOHC_CylinderHead
{
	public Shimutshibu_RC_DDSB8C_cylinder_head( int id )
	{
		super( id );
		name = "Powertech II MPFI Eletronic injection cylinder head";
		description = "8 valve";

		value = tHUF2USD(4*15+175);
		brand_new_prestige_value = 85.42;
		setMaxWear(kmToMaxWear(230000.0));

		intake_manifold_slot_ID = 27;
		exhaust_header_slot_ID = 49;
		camshaft_bearing_slot_ID = 31;
		cover_slot_ID = 29;

		exhaust_camshaft_slot_ID = 35;
		intake_camshaft_slot_ID = 33;

		intake_valve_diam = 43.5;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 45.5;
		number_of_exhaust_valves_per_cylinder = 1.0;

		intake_efficiency_tuning = 1.0;
		exhaust_efficiency_tuning = 1.0;

		cc_dome_safe_clearance = 0.0;

		maxRPM = 18000.0;
		inertia = kgToInertia(4*0.5);

		T_loss = 2.0;
		Vmin = -9.58; // in cc //
	}
}
