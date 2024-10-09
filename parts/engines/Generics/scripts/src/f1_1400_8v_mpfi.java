package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class f1_1400_8v_mpfi extends Set
{
	public f1_1400_8v_mpfi( int id )
	{
		super( id );
		name = "Motor GM Familia 1 1.4 MPFI 8v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000061AAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000066AAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000069AAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000071AAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000076AAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000F271r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F321r ); // Comando
		inv.insertItem( parts.engines.Generics:0x0000F331r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000F351r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000F281r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000F311r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000F301r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000F371r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000F421r ); // Distribuidor
	}
}