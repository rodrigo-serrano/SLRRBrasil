package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class sevel15bura extends Set
{
	public sevel15bura( int id )
	{
		super( id );
		name = "Motor Sevel 1.5 Carburado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Sevel:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Sevel:0x0000111Br ); // Virabrequim
		inv.insertItem( parts.engines.Sevel:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Sevel:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Sevel:0x0000189Fr ); // Pistoes
		inv.insertItem( parts.engines.Sevel:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Sevel:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Sevel:0x0000115Fr ); // Cambio
		inv.insertItem( parts.engines.Sevel:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Sevel:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Sevel:0x00000099r ); // Comando
		inv.insertItem( parts.engines.Sevel:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Sevel:0x00002CA1r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Sevel:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Sevel:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Sevel:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Sevel:0x00006AB1r ); // Bomba Combustivel
		inv.insertItem( parts.engines.Sevel:0x00006AC1r ); // Bomba Dagua
		inv.insertItem( parts.engines.Sevel:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.Sevel:0x00006AE1r ); // Coletor Admissao
		inv.insertItem( parts.engines.Sevel:0x00006AD1r ); // Carburador
		inv.insertItem( parts.engines.Sevel:0x00005AA1r ); // Distribuidor
	}
}