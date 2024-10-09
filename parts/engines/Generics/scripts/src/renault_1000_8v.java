package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class renault_1000_8v extends Set
{
	public renault_1000_8v( int id )
	{
		super( id );
		name = "Motor Renault 1.0 8v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000027BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000029BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000031BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000032BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000034BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F921r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F951r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000F941r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F931r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F961r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F001r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F971r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F981r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F991r ); // Filtro
	}
}