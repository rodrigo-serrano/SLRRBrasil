package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class endura_1000 extends Set
{
	public endura_1000( int id )
	{
		super( id );
		name = "Motor Ford Endura 1.0 Injetado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000064BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000067BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000066BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000069BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000E241r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000E251r ); // Tampa Comando
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000071BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E271r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E281r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E261r ); // Correia Alternador
		inv.insertItem( parts.engines.Generics:0x0000E301r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E311r ); // Defletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E331r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E351r ); // Flauta
	}
}