package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_EJ25_STI_engine extends Set
{
	public kit_EJ25_STI_engine( int id )
	{
		super( id );
		name = "Motor Subaru EJ25 STI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Boxer4:0x00000001r ); // block
		inv.insertItem( parts.engines.Boxer4:0x000000FEr ); // crank
		inv.insertItem( parts.engines.Boxer4:0x00000100r ); // flywheel
		inv.insertItem( parts.engines.Boxer4:0x00000103r ); // clutch
		inv.insertItem( parts.engines.Boxer4:0x0000009Br ); // rocker			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000095r ); // sump			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000ADr ); // head L			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000AFr ); // head R			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000B3r ); // cam1 L
		inv.insertItem( parts.engines.Boxer4:0x000000B4r ); // cam2 L
		inv.insertItem( parts.engines.Boxer4:0x000000B5r ); // cam1 R
		inv.insertItem( parts.engines.Boxer4:0x000000B7r ); // cam2 R
		inv.insertItem( parts.engines.Boxer4:0x000000BBr ); // cam bridge L		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BAr ); // cam bridge R		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BDr ); // valve cover L		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000BCr ); // valve cover R		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000001DAr ); // intake			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000F45r ); // turbo exhaust L		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000E45r ); // turbo exhaust R		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000A3r ); // fuel rail		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000098r ); // tranny			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000096r ); // alt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000097r ); // alt belt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x0000009Ar ); // cam belt			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x000000FFr ); // conrods
		inv.insertItem( parts.engines.Boxer4:0x00000101r ); // pistons
		inv.insertItem( parts.engines.Boxer4:0x000001D6r ); // upper ic			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000EBEr ); // turbo
		inv.insertItem( parts.engines.Boxer4:0x00000086r ); // turbo filter
		inv.insertItem( parts.engines.Boxer4:0x00000F47r ); // turbo L piping
		inv.insertItem( parts.engines.Boxer4:0x000001E0r ); // turbo R piping
		inv.insertItem( parts.engines.Boxer4:0x00000F9Ar ); // intercooler
		inv.insertItem( parts.engines.Boxer4:0x000001F2r ); // turbo exhaust pipe
		inv.insertItem( parts.engines.Boxer4:0x0000001Cr ); // oil filter		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000048r ); // water pump		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x0000004Cr ); // radiator hoses		<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000050r ); // radiator			<-UNI
		inv.insertItem( parts.engines.Boxer4:0x00000054r ); // radiator diffuser	<-UNI
	}
}
