package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class f1_1600_16v_mpfi extends Set
{
	public f1_1600_16v_mpfi( int id )
	{
		super( id );
		name = "Motor GM Familia 1 1.6 GSI 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000062AAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000067AAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000069AAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000072AAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000077AAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x000092AAr ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F461r ); // Comando Adm
		inv.insertItem( parts.engines.Generics:0x0000F471r ); // Comando Esc
		inv.insertItem( parts.engines.Generics:0x0000F481r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F501r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F491r ); // Capa
		inv.insertItem( parts.engines.Generics:0x0000F541r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F531r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F511r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F521r ); // Flauta
	}
}