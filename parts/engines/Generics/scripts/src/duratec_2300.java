package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class duratec_2300 extends Set
{
	public duratec_2300( int id )
	{
		super( id );
		name = "Motor Ford Duratec 2.3 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000004BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000007BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000013BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000011BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000015BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F741r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x000021BAr ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x000022BAr ); // Comando esc
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