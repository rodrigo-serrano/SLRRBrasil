package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SeriesKhonda_8 extends Set
{
	public kit_SeriesKhonda_8( int id )
	{
		super( id );
		name = "Motor Honda K20 ITB";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.SeriesKhonda:0x00000052r ); // stock 2.0 block
        	inv.insertItem( parts.engines.SeriesKhonda:0x00000044r ); // stock 2.0 crankshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBA9r ); // timing case
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Er ); // crankshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x00000049r ); // oil_pan
		inv.insertItem( parts.engines.SeriesKhonda:0x00000056r ); // stock connecting_rods
		inv.insertItem( parts.engines.SeriesKhonda:0x00000A57r ); // race pistons 
		inv.insertItem( parts.engines.SeriesKhonda:0x0000004Dr ); // alternator
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Ar ); // flywheel
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000043r ); // clutch
		inv.insertItem( parts.engines.SeriesKhonda:0x0000000Br ); // race transmission
		inv.insertItem( parts.engines.SeriesKhonda:0x00000042r ); // stock k20 cylinder_head
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BA99r ); // mild exhaust cam
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BA9Ar ); // mild intake camshaft
		inv.insertItem( parts.engines.SeriesKhonda:0x00000058r ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.SeriesKhonda:0x0000009Br ); // cylinder_head_cover
		inv.insertItem( parts.engines.SeriesKhonda:0x00000047r ); // Baiern_camshaft_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000DB98r ); // tubular exhaust_header
		inv.insertItem( parts.engines.SeriesKhonda:0x0000BB97r ); // street itb
		inv.insertItem( parts.engines.SeriesKhonda:0x0000CBE2r ); // fuel_rail 11
 		inv.insertItem( parts.engines.SeriesKhonda:0x00000048r ); // Baiern_alternator_drive_belt
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EE26r ); // ignition
		inv.insertItem( parts.engines.SeriesKhonda:0x0000EC46r ); // mugen spark cover


	 }
}
