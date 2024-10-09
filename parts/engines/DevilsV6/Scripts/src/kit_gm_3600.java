package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class kit_gm_3600 extends Set
{
	public kit_gm_3600( int id )
	{
		super( id );
		name = "Motor Chevrolet Alloytech 3.6";
		description = "";
	}

	public void build( Inventory inv )
	{
		// short block
		inv.insertItem( parts.engines.DevilsV6:0x0000000Ar ); // bloco
		inv.insertItem( parts.engines.DevilsV6:0x0000000Br ); // virabrequim
		inv.insertItem( parts.engines.DevilsV6:0x0000009Br ); // mancal vira
		inv.insertItem( parts.engines.DevilsV6:0x00000095r ); // carter
		inv.insertItem( parts.engines.DevilsV6:0x00000255r ); // bielas
		inv.insertItem( parts.engines.DevilsV6:0x000002AAr ); // pistoes
		// peripherals
		inv.insertItem( parts.engines.DevilsV6:0x0000009Ar ); // correia dentada
		inv.insertItem( parts.engines.DevilsV6:0x00000096r ); // alternador
		inv.insertItem( parts.engines.DevilsV6:0x00000097r ); // correia alternador
		// transmission
		inv.insertItem( parts.engines.DevilsV6:0x000000A6r ); // volante
		inv.insertItem( parts.engines.DevilsV6:0x000000A7r ); // embreagem
		inv.insertItem( parts.engines.DevilsV6:0x0000A033r ); // cambio
		// heads
		inv.insertItem( parts.engines.DevilsV6:0x0000A004r ); // cabecote esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x0000A003r ); // cabecote direito
		inv.insertItem( parts.engines.DevilsV6:0x00000003r ); // comando escape esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000C7r ); // comando admissao esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000FCr ); // comando escape direito
		inv.insertItem( parts.engines.DevilsV6:0x000000FDr ); // comando admissao direito
		inv.insertItem( parts.engines.DevilsV6:0x000000BBr ); // mancal comando esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000BAr ); // mancal comando direito
		inv.insertItem( parts.engines.DevilsV6:0x000000BDr ); // tampa valvula esquerda
		inv.insertItem( parts.engines.DevilsV6:0x000000BCr ); // tampa valvula direita
		inv.insertItem( parts.engines.DevilsV6:0x00000A52r ); // capa correia
		// manifolds
		inv.insertItem( parts.engines.DevilsV6:0x000000B0r ); // escape esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000B2r ); // escape direito
		inv.insertItem( parts.engines.DevilsV6:0x000000A1r ); // coletor admissao
		inv.insertItem( parts.engines.DevilsV6:0x000000A3r ); // flauta

		inv.insertItem( parts.engines.DevilsV6:0x00000286r ); // filtros
	}
}
