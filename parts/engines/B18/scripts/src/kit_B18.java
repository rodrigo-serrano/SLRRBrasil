package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_B18 extends Set
{
	public kit_B18( int id )
	{
		super( id );
		name = "Kit Motor Honda B16";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.B18:0x00000052r ); // Baiern_Devils_6SFi_3_6_block
        inv.insertItem( parts.engines.B18:0x00000044r ); // Baiern_88er_crankshaft
		inv.insertItem( parts.engines.B18:0x0000004Er ); // Baiern_crankshaft_bearing_bridge
		inv.insertItem( parts.engines.B18:0x00000049r ); // Baiern_oil_pan
		inv.insertItem( parts.engines.B18:0x0000CC49r ); // Baiern_oil_pan_1
		inv.insertItem( parts.engines.B18:0x00000056r ); // Baiern_Devils_6SFi_connecting_rods
		inv.insertItem( parts.engines.B18:0x00000057r ); // Baiern_Devils_6SFi_HC_pistons
		inv.insertItem( parts.engines.B18:0x0000004Dr ); // Baiern_alternator
		inv.insertItem( parts.engines.B18:0x0000000Ar ); // Baiern_Devils_6SFi_3_6_flywheel
		inv.insertItem( parts.engines.B18:0x000000BCr ); // Baiern_Devils_RaceMan6_transmission
 		inv.insertItem( parts.engines.B18:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.B18:0x00000042r ); // Baiern_Devils_6SFi_cylinder_head
		inv.insertItem( parts.engines.B18:0x00000099r ); // Baiern_GT_III_exhaust_camshaft
		inv.insertItem( parts.engines.B18:0x0000009Ar ); // Baiern_GT_III_intake_camshaft
		inv.insertItem( parts.engines.B18:0x00000058r ); // Baiern_camshaft_bearing_bridge
		inv.insertItem( parts.engines.B18:0x0000BB9Br ); // Baiern_Devils_6SFi_cylinder_head_cover
		inv.insertItem( parts.engines.B18:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.B18:0x00000C98r ); // Baiern_GT_III_exhaust_header
		inv.insertItem( parts.engines.B18:0x00000B97r ); // Baiern_GT_III_intake_manifold
		inv.insertItem( parts.engines.B18:0x0000ABA2r ); // Baiern_GT_III_fuel_rail
		inv.insertItem( parts.engines.B18:0x00000A54r ); // Baiern_GT_III_fuel_rail
 		inv.insertItem( parts.engines.B18:0x00000048r ); // Baiern_alternator_drive_belt
	 }
}