package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class vr_6_2_9_cylinder_head extends DOHC_CylinderHead
{
	public vr_6_2_9_cylinder_head( int id )
	{
		super( id );
		name = "Cabecote VW VR6 2.9";
		description = " ";

		value = tHUF2USD(6*45+290);
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

		intake_valve_diam = 33.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 30.5;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(6*0.25);

		T_loss = 80.0;
		Vmin = 81.27; // in cc //

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "O Motor esta sem Corrente De Comando.";

                p = partOnSlot( 26 );
		if (!p)
			return "O Motor esta sem Corrente Inferior.";

                p = partOnSlot( 25 );
		if (!p)
			return "O Motor esta sem Porcas Do Bloco.";

                p = partOnSlot( 27 );
		if (!p)
			return "O Motor esta sem Capa Da Corrente De Comando.";

                p = partOnSlot( 28 );
		if (!p)
			return "O Motor esta sem Velas.";

                p = partOnSlot( 29 );
		if (!p)
			return "O Motor esta sem Valvulas.";

		return super.isDynoable();
	}
}