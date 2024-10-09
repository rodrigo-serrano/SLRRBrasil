package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_C20XE_2 extends Set
{
	public kit_C20XE_2( int id )
	{
		super( id );
		name = "Motor Opel C20XE ITB";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Cr ); // block
		inv.insertItem( parts.engines.CHE_C20XE:0x00000070r ); // crankshaft
		inv.insertItem( parts.engines.CHE_C20XE:0x00000071r ); // crankshaft_bearing_bridge
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Fr ); // connecting_rods
		inv.insertItem( parts.engines.CHE_C20XE:0x00000080r ); // pistons
		inv.insertItem( parts.engines.CHE_C20XE:0x00000079r ); // flywheel
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Er ); // clutch
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Fr ); // oil_pan
		inv.insertItem( parts.engines.CHE_C20XE:0x00000085r ); // transmission_2
		inv.insertItem( parts.engines.CHE_C20XE:0x00000069r ); // alternator
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Ar ); // alternator_drive_belt
		inv.insertItem( parts.engines.CHE_C20XE:0x00000072r ); // cylinder_head
		inv.insertItem( parts.engines.CHE_C20XE:0x00000075r ); // exhaust_camshaft
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Er ); // intake_camshaft
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Dr ); // intake_2
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Br ); // fuel_rail_2
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Dr ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.CHE_C20XE:0x00000073r ); // cylinder_head_cover
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Br ); // belt_cover
		inv.insertItem( parts.engines.CHE_C20XE:0x00000074r ); // drive_belt
		inv.insertItem( parts.engines.CHE_C20XE:0x00000081r ); // spark_plugs
		inv.insertItem( parts.engines.CHE_C20XE:0x00000083r ); // spark_plugs_cover_2
		inv.insertItem( parts.engines.CHE_C20XE:0x00000077r ); // exhaust_header_2 
	}
}
