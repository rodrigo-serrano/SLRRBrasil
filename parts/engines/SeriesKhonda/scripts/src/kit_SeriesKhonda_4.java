package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_4 extends Set
{
	public kit_SeriesKhonda_4( int id )
	{
		super( id );
		name = "Motor Honda K24 Turbo intercooler";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A52r ); // Baiern_Devils_6SFi_3_6_block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000A44r ); // Baiern_88er_crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // Baiern_crankshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // Baiern_oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A56r ); // Baiern_Devils_6SFi_connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A57r ); // Baiern_Devils_6SFi_HC_pistons
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // Baiern_alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // Baiern_Devils_6SFi_3_6_flywheel
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Br ); // Baiern_Devils_RaceMan6_transmission
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A42r ); // Baiern_Devils_6SFi_cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A99r ); // Baiern_GT_III_exhaust_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A9Ar ); // Baiern_GT_III_intake_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // Baiern_camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000D9Br ); // Baiern_Devils_6SFi_cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x00000098r ); // Baiern_GT_III_exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A97r ); // Baiern_GT_III_intake_manifold2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000AAE2r ); // Baiern_GT_III_fuel_rail_8
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CC97r ); // turbo_3
		inv.insertItem( parts.engines.SeriesKhonda:0x0000AE98r ); // pipe_turbo_exhaust_2
		inv.insertItem( parts.engines.SeriesKhonda:0x00000E98r ); // pipe_turbo_exhaust
		inv.insertItem( parts.engines.SeriesKhonda:0x0000298Dr ); // oil2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BD42r ); // shield
		inv.insertItem( parts.engines.SeriesKhonda:0x0000ED99r ); // air intake

	 }
}
