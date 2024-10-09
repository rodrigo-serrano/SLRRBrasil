package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class civic_1800 extends Set
{
	public civic_1800( int id )
	{
		super( id );
		name = "Motor Honda Civic 1.8 16v R18";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000077BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000078BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000079BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000080BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000081BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E381r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E471r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000E461r ); // Comando esc
		inv.insertItem( parts.engines.Generics:0x0000E401r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000E391r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E431r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000E441r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E451r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E481r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000E411r ); // Capa
		inv.insertItem( parts.engines.Generics:0x0000E421r ); // cavalete
	}
}