package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head_5cyl_24 extends DOHC_CylinderHead
{
	public cylinder_head_5cyl_24( int id )
	{
		super( id );
		name = "Cabecote Fiat V.I.S. 2.4 20v";
		description = "";

		value = tHUF2USD(240.704);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_efficiency_tuning = 1.25;
		exhaust_efficiency_tuning = 1.25;

		intake_valve_diam = 33.6;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 28.1;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(20*0.6);

		T_loss = 80.0;
		Vmin = 105.9; // in cc //

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
