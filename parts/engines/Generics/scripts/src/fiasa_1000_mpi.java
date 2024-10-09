package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class fiasa_1000_mpi extends Set
{
	public fiasa_1000_mpi( int id )
	{
		super( id );
		name = "Motor Fiasa 1.0 MPI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Generics:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Generics:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000000BCr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x00000099r ); // Comando
		inv.insertItem( parts.engines.Generics:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F101r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F131r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F181r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F121r ); // Distribuidor
		inv.insertItem( parts.engines.Generics:0x0000F171r ); // Filtro
	}
}