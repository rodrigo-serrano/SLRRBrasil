package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_fiasa_1500 extends SOHC_CylinderHead
{
	public cabecote_fiasa_1500( int id )
	{
		super( id );
		name = "Cabecote Fiasa 1.5 8v";
		description = "";

		value = 1000;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		camshaft_slot_ID = 4;

		intake_efficiency_tuning = 2.35;
		exhaust_efficiency_tuning = 2.10;

		intake_valve_diam = 36.5;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 31.0;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(20*0.25);

		T_loss = 80.0;
		Vmin = 81.27; // in cc //

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
