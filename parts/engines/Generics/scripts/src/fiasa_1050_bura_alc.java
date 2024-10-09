package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class fiasa_1050_bura_alc extends Set
{
	public fiasa_1050_bura_alc( int id )
	{
		super( id );
		name = "Motor Fiasa 1.05 Carburado Alcool";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000029AAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000024AAr ); // Pistoes
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
		inv.insertItem( parts.engines.Generics:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F151r ); // Distribuidor
		inv.insertItem( parts.engines.Generics:0x0000F161r ); // Filtro
	}
}