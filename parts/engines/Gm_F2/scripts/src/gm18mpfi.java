package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class gm18mpfi extends Set
{
	public gm18mpfi( int id )
	{
		super( id );
		name = "Motor GM F2 1.8 8v MPFI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Gm_F2:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Gm_F2:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.Gm_F2:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Gm_F2:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Gm_F2:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.Gm_F2:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Gm_F2:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Gm_F2:0x000000BCr ); // Cambio
		inv.insertItem( parts.engines.Gm_F2:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Gm_F2:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x00000099r ); // Comando
		inv.insertItem( parts.engines.Gm_F2:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Gm_F2:0x0000F101r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Gm_F2:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Gm_F2:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Gm_F2:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.Gm_F2:0x0000F291r ); // Coletor Admissao
		inv.insertItem( parts.engines.Gm_F2:0x0000F311r ); // Flauta
		inv.insertItem( parts.engines.Gm_F2:0x0000F221r ); // Distribuidor
		inv.insertItem( parts.engines.Gm_F2:0x0000F281r ); // Vareta
	}
}