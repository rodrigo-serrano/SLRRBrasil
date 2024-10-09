package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class fusca_1600_alc extends Set
{
	public fusca_1600_alc( int id )
	{
		super( id );
		name = "Motor Fusca 1600 A Alcool";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.boxer_fusca:0x000001A8r ); // Bloco
		inv.insertItem( parts.engines.boxer_fusca:0x000001B4r ); // Virabrequim
		inv.insertItem( parts.engines.boxer_fusca:0x000001B8r ); // Trem De Valvulas
		inv.insertItem( parts.engines.boxer_fusca:0x000007A2r ); // Bielas
		inv.insertItem( parts.engines.boxer_fusca:0x000003B7r ); // Pistoes
		inv.insertItem( parts.engines.boxer_fusca:0x000001D4r ); // Volante
		inv.insertItem( parts.engines.boxer_fusca:0x000001B0r ); // Embreagem
		inv.insertItem( parts.engines.boxer_fusca:0x000011A0r ); // Cambio
		inv.insertItem( parts.engines.boxer_fusca:0x000001E0r ); // Carter
		inv.insertItem( parts.engines.boxer_fusca:0x000007E8r ); // Comando
		inv.insertItem( parts.engines.boxer_fusca:0x000001C4r ); // Cabecote Esquerdo
		inv.insertItem( parts.engines.boxer_fusca:0x000001C8r ); // Cabecote Direito
		inv.insertItem( parts.engines.boxer_fusca:0x000001BCr ); // Tampa Esquerda
		inv.insertItem( parts.engines.boxer_fusca:0x000001C0r ); // Tampa Direita
		inv.insertItem( parts.engines.boxer_fusca:0x00006700r ); // Escapamento
		inv.insertItem( parts.engines.boxer_fusca:0x000021DCr ); // Coletor Adm
		inv.insertItem( parts.engines.boxer_fusca:0x000011D8r ); // Carburador
		inv.insertItem( parts.engines.boxer_fusca:0x00007300r ); // Filtro
		inv.insertItem( parts.engines.boxer_fusca:0x00001000r ); // Capela
		inv.insertItem( parts.engines.boxer_fusca:0x000001F0r ); // Distribuidor
		inv.insertItem( parts.engines.boxer_fusca:0x000001F4r ); // Bomba Comb
	}
}