package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_2 extends Set
{
	public kit_SeriesKhonda_2( int id )
	{
		super( id );
		name = "Motor Honda K20 Supercharger";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000052r ); // Baiern_Devils_6SFi_3_6_block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000044r ); // Baiern_88er_crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // Baiern_crankshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // Baiern_oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000056r ); // Baiern_Devils_6SFi_connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000057r ); // Baiern_Devils_6SFi_HC_pistons
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // Baiern_alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // Baiern_Devils_6SFi_3_6_flywheel
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x000000BCr ); // Baiern_Devils_RaceMan6_transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000042r ); // Baiern_Devils_6SFi_cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x00000099r ); // Baiern_GT_III_exhaust_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Ar ); // Baiern_GT_III_intake_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // Baiern_camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Br ); // Baiern_Devils_6SFi_cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DB98r ); // Baiern_GT_III_exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BA97r ); // Baiern_GT_III_intake_manifold
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CB97r ); // turbo_2
		inv.insertItem( parts.engines.SeriesKhonda:0x00000AE2r ); // Baiern_GT_III_fuel_rail_2
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000AB42r ); // carbon cover
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CD66r ); // supercharger intake
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EC56r ); // black spark cover
		inv.insertItem( parts.engines.SeriesKhonda:0x0000098Dr ); // pcv filter

	 }
}
