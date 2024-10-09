package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class cylinder_head_race extends DOHC_CylinderHead
{
	public cylinder_head_race( int id )
	{
		super( id );
		name = "B18 HONDA cylinder head";
		description = "";

		value = tHUF2USD(280.52);
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

		intake_valve_diam = 39.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 37.0;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		inertia = kgToInertia(5*0.25);

		T_loss = 80.0;
		Vmin = 81.27; // in cc //

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.VAG_7A:0x00000099r, "Baiern_GT_III_exhaust_camshaft", desc );
		addPart( parts.engines.VAG_7A:0x0000009Ar, "Baiern_GT_III_intake_camshaft", desc );
		addPart( parts.engines.VAG_7A:0x00000058r, "Baiern_camshaft_bearing_bridge", desc );
		addPart( parts.engines.VAG_7A:0x000000BBr, "Baiern_GT_III_cylinder_head_cover", desc );
		addPart( parts.engines.VAG_7A:0x00000047r, "Baiern_camshaft_drive_belt", desc );
		addPart( parts.engines.VAG_7A:0x00000097r, "Baiern_GT_III_intake_manifold", desc );
		addPart( parts.engines.VAG_7A:0x00000098r, "Baiern_GT_III_exhaust_header", desc );


	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		return super.isDynoable();
	}
}
