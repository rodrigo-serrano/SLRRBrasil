package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class gm20bura extends Set
{
	public gm20bura( int id )
	{
		super( id );
		name = "Motor GM F2 2.0 8v Carburado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Gm_F2:0x0000111Ar ); // Bloco
		inv.insertItem( parts.engines.Gm_F2:0x0000111Br ); // Virabrequim
		inv.insertItem( parts.engines.Gm_F2:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Gm_F2:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Gm_F2:0x0000113Ar ); // Pistoes
		inv.insertItem( parts.engines.Gm_F2:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Gm_F2:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Gm_F2:0x0000B31Ar ); // Cambio
		inv.insertItem( parts.engines.Gm_F2:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Gm_F2:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x0000113Br ); // Comando
		inv.insertItem( parts.engines.Gm_F2:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Gm_F2:0x0000F101r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Gm_F2:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Gm_F2:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Gm_F2:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.Gm_F2:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.Gm_F2:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.Gm_F2:0x0000F221r ); // Distribuidor
		inv.insertItem( parts.engines.Gm_F2:0x0000F281r ); // Vareta
	}
}