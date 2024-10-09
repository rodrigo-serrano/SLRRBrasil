package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_willys_3000_duplo extends Set
{
	public kit_willys_3000_duplo( int id )
	{
		super( id );
		name = "Motor Willys Itamaraty 3000";
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
		inv.insertItem( parts.engines.BF_161:0x0000AA00r ); // Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000A113r ); // Comando
		inv.insertItem( parts.engines.BF_161:0x0000AA50r ); // Tampa Comando
		inv.insertItem( parts.engines.BF_161:0x0000AA60r ); // Tampa Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.BF_161:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.BF_161:0x0000AA10r ); // Coletor Escape
		inv.insertItem( parts.engines.BF_161:0x0000AB00r ); // Coletor Admissao
		inv.insertItem( parts.engines.BF_161:0x0000AA20r ); // Carbura
		inv.insertItem( parts.engines.BF_161:0x0000AA40r ); // Radiator
	}
}