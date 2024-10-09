package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class marea_2000_stroker extends Set
{
	public marea_2000_stroker( int id )
	{
		super( id );
		name = "Motor Fiat Marea 2.0 16v Stroker";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000038BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000040BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000041BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000043BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000044BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F011r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F021r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000F031r ); // Comando escp
		inv.insertItem( parts.engines.Generics:0x0000F081r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F091r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F071r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F061r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F041r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F051r ); // Flauta
	}
}