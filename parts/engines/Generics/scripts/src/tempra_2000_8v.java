package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class tempra_2000_8v extends Set
{
	public tempra_2000_8v( int id )
	{
		super( id );
		name = "Motor Fiat Tempra 2.0 8v Carburado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000083BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000084BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000085BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000086BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000092BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E621r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E711r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000E701r ); // Comando escp
		inv.insertItem( parts.engines.Generics:0x0000E631r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000E651r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E671r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E681r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E751r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E731r ); // Carburador
	}
}