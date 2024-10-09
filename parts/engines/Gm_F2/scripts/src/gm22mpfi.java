package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class gm22mpfi extends Set
{
	public gm22mpfi( int id )
	{
		super( id );
		name = "Motor GM F2 2.2 8v MPFI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Gm_F2:0x0000BA1Ar ); // Bloco
		inv.insertItem( parts.engines.Gm_F2:0x0000BA2Ar ); // Virabrequim
		inv.insertItem( parts.engines.Gm_F2:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Gm_F2:0x0000BA5Ar ); // Bielas
		inv.insertItem( parts.engines.Gm_F2:0x0000BA3Ar ); // Pistoes
		inv.insertItem( parts.engines.Gm_F2:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Gm_F2:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Gm_F2:0x0000B34Ar ); // Cambio
		inv.insertItem( parts.engines.Gm_F2:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Gm_F2:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x0000112Br ); // Comando
		inv.insertItem( parts.engines.Gm_F2:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Gm_F2:0x0000F361r ); // Tampa Cabecote
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