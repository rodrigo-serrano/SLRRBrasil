package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_willys_3000 extends Set
{
	public kit_willys_3000( int id )
	{
		super( id );
		name = "Motor Maverick Willys 3000";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.BF_161:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.BF_161:0x0000A110r ); // Virabrequim
		inv.insertItem( parts.engines.BF_161:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.BF_161:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.BF_161:0x0000A111r ); // Pistoes
		inv.insertItem( parts.engines.BF_161:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.BF_161:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.BF_161:0x00000583r ); // Cambio
		inv.insertItem( parts.engines.BF_161:0x00000049r ); // Carter
		inv.insertItem( parts.engines.BF_161:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000A112r ); // Comando
		inv.insertItem( parts.engines.BF_161:0x0000AA50r ); // Tampa Comando
		inv.insertItem( parts.engines.BF_161:0x0000AA60r ); // Tampa Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.BF_161:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.BF_161:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.BF_161:0x0000AB10r ); // Coletor Admissao
		inv.insertItem( parts.engines.BF_161:0x000000E2r ); // Carbura
		inv.insertItem( parts.engines.BF_161:0x0000AA30r ); // Filtro
		inv.insertItem( parts.engines.BF_161:0x0000AA40r ); // Radiator
	}
}