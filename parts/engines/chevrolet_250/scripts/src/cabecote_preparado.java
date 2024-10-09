package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_preparado extends OHV_CylinderHead
{
	public cabecote_preparado( int id )
	{
		super( id );
		name = "Cabecote Preparado Chevrolet 250";
		description = "";

		value = 6500;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		engine_block_slot_ID = 19;

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		cover_slot_ID = 18;

		intake_rocker_ratio = 1.75;
		exhaust_rocker_ratio = 1.75;

		intake_efficiency_tuning = 2.0;
		exhaust_efficiency_tuning = 2.0;

		intake_valve_diam = 50.00;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 40.0;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 14.5;
		inertia = kgToInertia(0.2);

		T_loss = 80.0;
		Vmin = 0.00; // in cc //

		check4warnings();
	}
}