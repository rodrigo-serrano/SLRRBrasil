package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_7 extends Set
{
	public kit_SeriesKhonda_7( int id )
	{
		super( id );
		name = "Motor Honda K24";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000B52r ); // stock 2.4 block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000B44r ); // stock 2.4 crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // crankshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000B56r ); // stock connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000057r ); // stock pistons 
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // flywheel
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x000000BCr ); // stock transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000B42r ); // stock k24 cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x00000099r ); // stock exhaust cam
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Ar ); // stock intake camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Br ); // cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A98r ); // stock exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CA97r ); // stock intake_manifold
		inv.insertItem( parts.engines.SeriesKhonda:0x00000AE2r ); // fuel_rail
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EC56r ); // black spark cover
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DB42r ); // stock heatshield

	 }
}
