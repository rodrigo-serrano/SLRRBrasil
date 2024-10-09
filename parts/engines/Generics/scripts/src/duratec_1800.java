package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class duratec_1800 extends Set
{
	public duratec_1800( int id )
	{
		super( id );
		name = "Motor Ford Duratec 1.8 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000003BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000006BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000013BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000009BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000014BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F741r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F781r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000F771r ); // Comando esc
		inv.insertItem( parts.engines.Generics:0x0000F751r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F761r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F791r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F871r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F821r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F811r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F801r ); // Bobina
	}
}