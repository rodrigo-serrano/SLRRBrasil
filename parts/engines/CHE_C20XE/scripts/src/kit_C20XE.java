package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_C20XE extends Set
{
	public kit_C20XE( int id )
	{
		super( id );
		name = "Motor Chevrolet C20XE Turbo";
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
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Cr ); // intake
		inv.insertItem( parts.engines.CHE_C20XE:0x0000007Ar ); // fuel_rail
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Dr ); // camshaft_bearing_bridge
		inv.insertItem( parts.engines.CHE_C20XE:0x00000073r ); // cylinder_head_cover
		inv.insertItem( parts.engines.CHE_C20XE:0x0000006Br ); // belt_cover
		inv.insertItem( parts.engines.CHE_C20XE:0x00000074r ); // drive_belt
		inv.insertItem( parts.engines.CHE_C20XE:0x00000081r ); // spark_plugs
		inv.insertItem( parts.engines.CHE_C20XE:0x00000082r ); // spark_plugs_cover
		inv.insertItem( parts.engines.CHE_C20XE:0x00000078r ); // exhaust_header_3
		inv.insertItem( parts.engines.CHE_C20XE:0x00000088r ); // turbocharger
		inv.insertItem( parts.engines.CHE_C20XE:0x00000087r ); // turbo_to_intake
		inv.insertItem( parts.engines.CHE_C20XE:0x00000086r ); // turbo_to_exhaust
	}
}
