package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head extends SOHC_CylinderHead
{
	public cylinder_head( int id )
	{
		super( id );
		name = "OHC cylinder head";
		description = "";

		value = tHUF2USD(80.704);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(4110000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		camshaft_slot_ID = 5;

		intake_efficiency_tuning = 0.76;
		exhaust_efficiency_tuning = 0.76;

		intake_valve_diam = 35.0;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 38.0;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 0.0;
		inertia = kgToInertia(8*0.6);

		T_loss = 0.0;
		Vmin = 0.0; // in cc //

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
