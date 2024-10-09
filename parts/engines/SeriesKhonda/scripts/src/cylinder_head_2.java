package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head_2 extends DOHC_CylinderHead
{
	public cylinder_head_2( int id )
	{
		super( id );
		name = "Cabecote Preparado Stumpft Honda Serie K";
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

		intake_efficiency_tuning = 1.35;
		exhaust_efficiency_tuning = 1.35;

		intake_valve_diam = 37.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 32.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		maxRPM = 15000.0;
		inertia = kgToInertia(1.32);

		T_loss = 80.0;
		Vmin = 50.7; // in cc //

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