package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class sevel19aspro extends Set
{
	public sevel19aspro( int id )
	{
		super( id );
		name = "Motor Sevel 1.9 Aspirado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Sevel:0x0000BA1Ar ); // Bloco
		inv.insertItem( parts.engines.Sevel:0x0000111Cr ); // Virabrequim
		inv.insertItem( parts.engines.Sevel:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Sevel:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Sevel:0x0000179Fr ); // Pistoes
		inv.insertItem( parts.engines.Sevel:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Sevel:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Sevel:0x0000162Br ); // Cambio
		inv.insertItem( parts.engines.Sevel:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Sevel:0x0000169Ar ); // Cabecote
		inv.insertItem( parts.engines.Sevel:0x0000113Fr ); // Comando
		inv.insertItem( parts.engines.Sevel:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Sevel:0x00002DA1r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Sevel:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Sevel:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Sevel:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Sevel:0x00002FC1r ); // Tampao Bomba Combustivel
		inv.insertItem( parts.engines.Sevel:0x00006AC1r ); // Bomba Dagua
		inv.insertItem( parts.engines.Sevel:0x00007CA1r ); // Coletor Escape
		inv.insertItem( parts.engines.Sevel:0x000011D1r ); // Coletor Admissao
		inv.insertItem( parts.engines.Sevel:0x000011A1r ); // Flauta
		inv.insertItem( parts.engines.Sevel:0x00005BA1r ); // Distribuidor
	}
}