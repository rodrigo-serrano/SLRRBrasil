package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;
 

public class vr_6_2_8_cylinder_head extends DOHC_CylinderHead
{
	public vr_6_2_8_cylinder_head( int id )
	{
		super( id );
		name = "Cabecote VW VR6 2.8";
		description = " ";

		value = tHUF2USD(6*25+210);
		brand_new_prestige_value = 48.54;
		setMaxWear(kmToMaxWear(317000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_valve_diam = 31.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 29.5;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		maxRPM = 20000.0;
		inertia = kgToInertia(6*0.3);

		T_loss = 80.0;
		Vmin = 80.74; // in cc //

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
