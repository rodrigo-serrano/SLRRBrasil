package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_1 extends Set
{
	public kit_SeriesKhonda_1( int id )
	{
		super( id );
		name = "Motor Honda K20";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000052r ); // stock 2.0 block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000044r ); // stock 2.0 crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000056r ); // stock connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000057r ); // stock pistons
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // flywheel
		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x000000BCr ); // stock transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000042r ); // cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x00000099r ); // stock exhaust_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Ar ); // stock intake_camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Br ); // cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A98r ); // stock exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CA97r ); // stock intake manifold
		inv.insertItem( parts.engines.SeriesKhonda:0x00000AE2r ); // fuel_rail
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // alternator_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EC66r ); // stock spark cover
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DB42r ); // stock heatshield
	 }
}
