package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_16v_c20 extends DOHC_CylinderHead
{
	public cabecote_16v_c20( int id )
	{
		super( id );
		name = "Cabecote Chevrolet C20XE 16v";
		description = "";

		value = 5000;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(411000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_efficiency_tuning = 2.00;
		exhaust_efficiency_tuning = 2.00;

		intake_valve_diam = 41.70;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 36.5;
		number_of_exhaust_valves_per_cylinder = 2.0;

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

		p = partOnSlot( 97 );
		if (!p)
			return "O Motor esta sem Bobina De Ignicao.";

		return super.isDynoable();
	}
}
