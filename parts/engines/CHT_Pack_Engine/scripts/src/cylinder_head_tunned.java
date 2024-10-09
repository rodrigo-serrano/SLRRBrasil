package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head_tunned extends DOHC_CylinderHead
{
	public cylinder_head_tunned( int id )
	{
		super( id );
		name = "Cabeçote baixo motor CHT";
		description = "";

		value = tHUF2USD(80.52);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_efficiency_tuning = 0.87;
		exhaust_efficiency_tuning = 0.89;

		intake_valve_diam = 32.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 35.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(0.5);

		T_loss = 80.0;
		Vmin = 4.00; // in cc //

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		return super.isDynoable();
	}
}
