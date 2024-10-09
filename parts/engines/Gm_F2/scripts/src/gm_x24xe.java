package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class gm_x24xe extends Set
{
	public gm_x24xe( int id )
	{
		super( id );
		name = "Motor GM F2 X24XE 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Gm_F2:0x0000B21Ar ); // Bloco
		inv.insertItem( parts.engines.Gm_F2:0x0000B22Ar ); // Virabrequim
		inv.insertItem( parts.engines.Gm_F2:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Gm_F2:0x0000BA5Ar ); // Bielas
		inv.insertItem( parts.engines.Gm_F2:0x0000B23Ar ); // Pistoes
		inv.insertItem( parts.engines.Gm_F2:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Gm_F2:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Gm_F2:0x0000B32Ar ); // Cambio
		inv.insertItem( parts.engines.Gm_F2:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Gm_F2:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Gm_F2:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Gm_F2:0x0000F391r ); // Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x0000F411r ); // Comando adm
		inv.insertItem( parts.engines.Gm_F2:0x0000F421r ); // Comando escape
		inv.insertItem( parts.engines.Gm_F2:0x0000F401r ); // Mancal Comando
		inv.insertItem( parts.engines.Gm_F2:0x0000F431r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Gm_F2:0x0000F471r ); // Tampa Vela
		inv.insertItem( parts.engines.Gm_F2:0x0000F581r ); // Correia Dentada
		inv.insertItem( parts.engines.Gm_F2:0x0000F611r ); // Coletor Escape
		inv.insertItem( parts.engines.Gm_F2:0x0000F591r ); // Coletor Admissao
		inv.insertItem( parts.engines.Gm_F2:0x0000F601r ); // Flauta
		inv.insertItem( parts.engines.Gm_F2:0x0000F481r ); // Bobina
		inv.insertItem( parts.engines.Gm_F2:0x0000F491r ); // Tampa Correia
	}
}