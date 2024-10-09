package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class renault_2000_f4r extends Set
{
	public renault_2000_f4r( int id )
	{
		super( id );
		name = "Motor Renault 2.0 16v F4R";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000047BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000048BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000049BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000050BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000051BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E011r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E101r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000E091r ); // Comando esc
		inv.insertItem( parts.engines.Generics:0x0000E031r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000E021r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E041r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E081r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E051r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E061r ); // Flauta
	}
}