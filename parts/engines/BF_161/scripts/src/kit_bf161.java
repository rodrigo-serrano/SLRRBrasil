package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_bf161 extends Set
{
	public kit_bf161( int id )
	{
		super( id );
		name = "Motor Willys BF-161";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.BF_161:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.BF_161:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.BF_161:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.BF_161:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.BF_161:0x00000096r ); // Pistoes
		inv.insertItem( parts.engines.BF_161:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.BF_161:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.BF_161:0x00000583r ); // Cambio
		inv.insertItem( parts.engines.BF_161:0x00000049r ); // Carter
		inv.insertItem( parts.engines.BF_161:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000009Ar ); // Comando
		inv.insertItem( parts.engines.BF_161:0x0000AA50r ); // Tampa Comando
		inv.insertItem( parts.engines.BF_161:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.BF_161:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.BF_161:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.BF_161:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.BF_161:0x0000AB10r ); // Coletor Admissao
		inv.insertItem( parts.engines.BF_161:0x000000E2r ); // Carbura
		inv.insertItem( parts.engines.BF_161:0x00000ABCr ); // Filtro
		inv.insertItem( parts.engines.BF_161:0x0000AA40r ); // Radiator
	}
}