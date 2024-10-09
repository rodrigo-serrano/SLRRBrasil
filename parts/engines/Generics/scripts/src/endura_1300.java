package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class endura_1300 extends Set
{
	public endura_1300( int id )
	{
		super( id );
		name = "Motor Ford Endura 1.3 Monoponto";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000065BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000068BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000066BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000070BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000072BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E241r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000E251r ); // Tampa Comando
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x000074BAr ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E281r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E261r ); // Correia Alternador
		inv.insertItem( parts.engines.Generics:0x0000E301r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E311r ); // Defletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E321r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E341r ); // Monoponto
		inv.insertItem( parts.engines.Generics:0x0000E361r ); // Filtro
	}
}