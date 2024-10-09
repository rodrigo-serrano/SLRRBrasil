package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class ea_111_1000 extends Set
{
	public ea_111_1000( int id )
	{
		super( id );
		name = "Motor Vw Ea111 1.0 8v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000096BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000001CAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000003CAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000098BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000005CAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E891r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E941r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000E901r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E951r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E911r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E921r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E931r ); // Flauta
	}
}