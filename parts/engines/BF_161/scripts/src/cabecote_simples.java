package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_simples extends OHV_CylinderHead
{
	public cabecote_simples( int id )
	{
		super( id );
		name = "Cabecote Willys BF-161 Carburacao Simples";
		description = "";

		value = 600;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		engine_block_slot_ID = 19;

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		cover_slot_ID = 18;

		intake_rocker_ratio = 1.50;
		exhaust_rocker_ratio = 1.50;

		intake_efficiency_tuning = 1.00;
		exhaust_efficiency_tuning = 1.00;

		intake_valve_diam = 50.79;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 35.9;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 15.0;
		inertia = kgToInertia(0.2);

		T_loss = 80.0;
		Vmin = 0.00; // in cc //

		check4warnings();

	}
}