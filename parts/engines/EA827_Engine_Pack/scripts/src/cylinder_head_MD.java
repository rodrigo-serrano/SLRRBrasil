package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head_MD extends SOHC_CylinderHead
{
	public cylinder_head_MD( int id )
	{
		super( id );
		name = "Cabecote Volkswagen AP 1.5 / 1.6 8v Bielinha";
		description = "";

		value = 300;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		camshaft_slot_ID = 5;

		intake_efficiency_tuning = 1.0;
		exhaust_efficiency_tuning = 0.8;

		intake_valve_diam = 37.0;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 32.5;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(7.5);

		T_loss = 0.0;
		Vmin = 0.00; // in cc //

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
