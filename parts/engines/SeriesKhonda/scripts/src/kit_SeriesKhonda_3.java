package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_3 extends Set
{
	public kit_SeriesKhonda_3( int id )
	{
		super( id );
		name = "Motor Honda K20 Turbo";
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
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A57r ); // Baiern_Devils_6SFi_HC_pistons
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // Baiern_alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // Baiern_Devils_6SFi_3_6_flywheel
		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Br ); // Baiern_Devils_RaceMan6_transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A42r ); // Baiern_Devils_6SFi_cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BA99r ); // Baiern_GT_III_exhaust_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BA9Ar ); // Baiern_GT_III_intake_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // Baiern_camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000D9Br ); // Baiern_Devils_6SFi_cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x00000B98r ); // Baiern_GT_III_exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A97r ); // Baiern_GT_III_intake_manifold2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DBE2r ); // Baiern_GT_III_fuel_rail_12
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DC97r ); // turbo_4
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BE56r ); // downpipe4
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BE98r ); // intercooler2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CB42r ); // turbine heat shield
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CE66r ); // filter3
		inv.insertItem( parts.engines.SeriesKhonda:0x0000198Dr ); // oil2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EC26r ); // spark cover custom

	 }
}
