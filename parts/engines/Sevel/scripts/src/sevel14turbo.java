package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class sevel14turbo extends Set
{
	public sevel14turbo( int id )
	{
		super( id );
		name = "Motor Sevel 1.4 Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Sevel:0x0000111Ar ); // Bloco
		inv.insertItem( parts.engines.Sevel:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.Sevel:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Sevel:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Sevel:0x0000111Dr ); // Pistoes
		inv.insertItem( parts.engines.Sevel:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Sevel:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Sevel:0x0000169Fr ); // Cambio
		inv.insertItem( parts.engines.Sevel:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Sevel:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Sevel:0x00000099r ); // Comando
		inv.insertItem( parts.engines.Sevel:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Sevel:0x00002FB1r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Sevel:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Sevel:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Sevel:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Sevel:0x00002FC1r ); // Tampao Bomba Combustivel
		inv.insertItem( parts.engines.Sevel:0x00006AC1r ); // Bomba Dagua
		inv.insertItem( parts.engines.Sevel:0x00007CB1r ); // Coletor Escape
		inv.insertItem( parts.engines.Sevel:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.Sevel:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.Sevel:0x00005AA1r ); // Distribuidor
		inv.insertItem( parts.engines.Sevel:0x00000051r ); // Turbina
		inv.insertItem( parts.engines.Sevel:0x00002AF1r ); // Pressurizacao
	}
}