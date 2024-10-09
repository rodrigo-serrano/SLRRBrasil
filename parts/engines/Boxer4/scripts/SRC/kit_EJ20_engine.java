package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_EJ20_engine extends Set
{
	public kit_EJ20_engine( int id )
	{
		super( id );
		name = "Motor Subaru EJ20";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Boxer4:0x0000000Ar ); // block
		inv.insertItem( parts.engines.Boxer4:0x0000000Br ); // crank
		inv.insertItem( parts.engines.Boxer4:0x000000A6r ); // flywheel
		inv.insertItem( parts.engines.Boxer4:0x000000A7r ); // clutch
		inv.insertItem( parts.engines.Boxer4:0x0000009Br ); // rocker			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000095r ); // sump
		inv.insertItem( parts.engines.Boxer4:0x000000ADr ); // head L			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000AFr ); // head R			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000C7r ); // cam1 L
		inv.insertItem( parts.engines.Boxer4:0x00000003r ); // cam2 L
		inv.insertItem( parts.engines.Boxer4:0x000000FDr ); // cam1 R
		inv.insertItem( parts.engines.Boxer4:0x000000FCr ); // cam2 R
		inv.insertItem( parts.engines.Boxer4:0x000000BBr ); // cam bridge L		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BAr ); // cam bridge R		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BDr ); // valve cover L		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BCr ); // valve cover R		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000A1r ); // intake			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000B2r ); // exhaust R (NA)		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000A3r ); // fuel rail		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000098r ); // tranny			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000096r ); // alt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000097r ); // alt belt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x0000009Ar ); // cam belt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000A8r ); // conrods
		inv.insertItem( parts.engines.Boxer4:0x000000AAr ); // pistons
		inv.insertItem( parts.engines.Boxer4:0x000000A5r ); // upper ic			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x0000001Cr ); // oil filter		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000048r ); // water pump		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x0000004Cr ); // radiator hoses		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000050r ); // radiator			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000054r ); // radiator diffuser	<-UNI
	}
}