package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class lada_1600 extends Set
{
	public lada_1600( int id )
	{
		super( id );
		name = "Motor Lada 1.6 8v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000097AAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000098AAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000099AAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000000BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x0000F591r ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F601r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F661r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000F651r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F611r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F621r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F671r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F631r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F691r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F711r ); // Filtro
		inv.insertItem( parts.engines.Generics:0x0000F731r ); // Capa
	}
}