package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class fusca_2400_turbo extends Set
{
	public fusca_2400_turbo( int id )
	{
		super( id );
		name = "Motor Fusca 2400 Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.boxer_fusca:0x000006A0r ); // Bloco
		inv.insertItem( parts.engines.boxer_fusca:0x00009A1Cr ); // Virabrequim
		inv.insertItem( parts.engines.boxer_fusca:0x000001B8r ); // Trem De Valvulas
		inv.insertItem( parts.engines.boxer_fusca:0x000001ECr ); // Bielas
		inv.insertItem( parts.engines.boxer_fusca:0x000003B2r ); // Pistoes
		inv.insertItem( parts.engines.boxer_fusca:0x000021D4r ); // Volante
		inv.insertItem( parts.engines.boxer_fusca:0x000021B0r ); // Embreagem
		inv.insertItem( parts.engines.boxer_fusca:0x00009F6Cr ); // Cambio
		inv.insertItem( parts.engines.boxer_fusca:0x000001E0r ); // Carter
		inv.insertItem( parts.engines.boxer_fusca:0x00009B2Cr ); // Comando
		inv.insertItem( parts.engines.boxer_fusca:0x000008A7r ); // Cabecote Esquerdo
		inv.insertItem( parts.engines.boxer_fusca:0x000008A8r ); // Cabecote Direito
		inv.insertItem( parts.engines.boxer_fusca:0x00006600r ); // Tampa Esquerda
		inv.insertItem( parts.engines.boxer_fusca:0x00006500r ); // Tampa Direita
		inv.insertItem( parts.engines.boxer_fusca:0x000061CCr ); // Escapamento
		inv.insertItem( parts.engines.boxer_fusca:0x000011DCr ); // Coletor Adm
		inv.insertItem( parts.engines.boxer_fusca:0x000001D8r ); // Carburador
		inv.insertItem( parts.engines.boxer_fusca:0x00005700r ); // Capela
		inv.insertItem( parts.engines.boxer_fusca:0x000001F0r ); // Distribuidor
		inv.insertItem( parts.engines.boxer_fusca:0x000001F4r ); // Bomba Comb
		inv.insertItem( parts.engines.boxer_fusca:0x00002100r ); // Nitro
		inv.insertItem( parts.engines.boxer_fusca:0x00007204r ); // Turbina Grande
		inv.insertItem( parts.engines.boxer_fusca:0x000051F1r ); // Saida Turbina Grande
		inv.insertItem( parts.engines.boxer_fusca:0x00006100r ); // Pressurização
	}
}