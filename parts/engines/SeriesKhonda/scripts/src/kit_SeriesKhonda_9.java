package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_9 extends Set
{
	public kit_SeriesKhonda_9( int id )
	{
		super( id );
		name = "Motor Honda K24 ITB";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A52r ); // race 2.4 block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000A44r ); // race 2.4 crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // crankshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A56r ); // race connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A57r ); // race pistons 
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // flywheel
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Br ); // race transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A42r ); // race cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A99r ); // race exhaust cam
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A9Ar ); // race intake camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000B9Br ); // cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x00000C98r ); // tubular exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x0000AA97r ); // race itb
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DBE2r ); // fuel_rail 12
		inv.insertItem( parts.engines.SeriesKhonda:0x0000ABE2r ); // itb scoop
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000298Dr ); // oil2
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DE26r ); // ignition


	 }
}
