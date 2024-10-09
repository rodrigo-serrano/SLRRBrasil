package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class kit_honda_3500 extends Set
{
	public kit_honda_3500( int id )
	{
		super( id );
		name = "Motor Honda J35 3.5 24v";
		description = "";
	}

	public void build( Inventory inv )
	{
		// short block
		inv.insertItem( parts.engines.DevilsV6:0x0000020Ar ); // bloco
		inv.insertItem( parts.engines.DevilsV6:0x0000023Er ); // virabrequim
		inv.insertItem( parts.engines.DevilsV6:0x0000009Br ); // mancal vira
		inv.insertItem( parts.engines.DevilsV6:0x00000095r ); // carter
		inv.insertItem( parts.engines.DevilsV6:0x00000055r ); // bielas
		inv.insertItem( parts.engines.DevilsV6:0x000003AAr ); // pistoes
		// peripherals
		inv.insertItem( parts.engines.DevilsV6:0x0000009Ar ); // correia dentada
		inv.insertItem( parts.engines.DevilsV6:0x00000096r ); // alternador
		inv.insertItem( parts.engines.DevilsV6:0x00000097r ); // correia alternador
		// transmission
		inv.insertItem( parts.engines.DevilsV6:0x000000A6r ); // volante
		inv.insertItem( parts.engines.DevilsV6:0x000000A7r ); // embreagem
		inv.insertItem( parts.engines.DevilsV6:0x0000A030r ); // cambio
		// heads
		inv.insertItem( parts.engines.DevilsV6:0x0000A006r ); // cabecote esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x0000A005r ); // cabecote direito
		inv.insertItem( parts.engines.DevilsV6:0x00000003r ); // comando escape esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000C7r ); // comando admissao esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000FCr ); // comando escape direito
		inv.insertItem( parts.engines.DevilsV6:0x000000FDr ); // comando admissao direito
		inv.insertItem( parts.engines.DevilsV6:0x000000BBr ); // mancal comando esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000BAr ); // mancal comando direito
		inv.insertItem( parts.engines.DevilsV6:0x0000D174r ); // tampa valvula esquerda
		inv.insertItem( parts.engines.DevilsV6:0x0000D178r ); // tampa valvula direita
		inv.insertItem( parts.engines.DevilsV6:0x00000A52r ); // capa correia
		// manifolds
		inv.insertItem( parts.engines.DevilsV6:0x000000B0r ); // escape esquerdo
		inv.insertItem( parts.engines.DevilsV6:0x000000B2r ); // escape direito
		inv.insertItem( parts.engines.DevilsV6:0x000000A1r ); // coletor admissao
		inv.insertItem( parts.engines.DevilsV6:0x000000A3r ); // flauta

		inv.insertItem( parts.engines.DevilsV6:0x00000286r ); // filtros
		inv.insertItem( parts.engines.DevilsV6:0x00001450r ); // capa motor
	}
}
