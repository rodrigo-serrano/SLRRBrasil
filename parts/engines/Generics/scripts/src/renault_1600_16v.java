package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class renault_1600_16v extends Set
{
	public renault_1600_16v( int id )
	{
		super( id );
		name = "Motor Renault 1.6 16v K4M";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000028BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000030BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000031BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000033BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000035BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x000055BAr ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x000053BAr ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x000054BAr ); // Comando esc
		inv.insertItem( parts.engines.Generics:0x0000E031r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000E021r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E041r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E081r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E051r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E061r ); // Flauta
	}
}