package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cabecote_esquerdo extends OHV_CylinderHead
{
	public cabecote_esquerdo( int id )
	{
		super( id );
		name = "Cabecote Esquerdo Motor Fusca 1600 e 1500";
		description = "";
		brand_new_prestige_value = 20;

		value = 600;
		setMaxWear(kmToMaxWear(51000.0));

		engine_block_slot_ID = 45;

		intake_rocker_ratio = 1.50;
		exhaust_rocker_ratio = 1.50;

		exhaust_header_slot_ID = 37;
		cover_slot_ID = 22;

		intake_efficiency_tuning = 1.00;
		exhaust_efficiency_tuning = 1.00;

		intake_valve_diam = 35.50;
		number_of_intake_valves_per_cylinder = 1.0;
		exhaust_valve_diam = 32.00;
		number_of_exhaust_valves_per_cylinder = 1.0;

		cc_dome_safe_clearance = 18.7;// Piston to Valve Clearance. No known effect.

		T_loss = 75.0;// Thermal Loss - Probably effects how the engine over heats and longevity, generally do not change.
		Vmin = 65.00; // in cc - Cylinder Combustion Chamber Size - Effects compression. //

		inertia = kgToInertia(4*0.55);

		check4warnings();
	}

}