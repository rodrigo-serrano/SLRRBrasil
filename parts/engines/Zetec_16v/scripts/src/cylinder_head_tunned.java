package java.game.parts.engines.Zetec_16v;

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
		name = "Cabeçote retrabalhado Zetec 16v";
		description = "";

		value = 1800;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_efficiency_tuning = 1.00;
		exhaust_efficiency_tuning = 1.00;

		intake_valve_diam = 35.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 32.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 1.0;
		inertia = kgToInertia(0.5);

		T_loss = 1.0;
		Vmin = 0.01; // in cc //

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "O Motor esta sem Correia Dentada.";

		return super.isDynoable();
	}
}
