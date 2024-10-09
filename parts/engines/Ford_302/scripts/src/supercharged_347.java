package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class supercharged_347 extends Set
{
	public supercharged_347( int id )
	{
		super( id );
		name = "Motor Ford 347 Supercharger";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Ford_302:0x0000007Er ); // Bloco
		inv.insertItem( parts.engines.Ford_302:0x0000007Dr ); // Virabrequim
		inv.insertItem( parts.engines.Ford_302:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Ford_302:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.Ford_302:0x0000126Ar ); // Pistoes
		inv.insertItem( parts.engines.Ford_302:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Ford_302:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Ford_302:0x0000113Ar ); // Cambio
		inv.insertItem( parts.engines.Ford_302:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Ford_302:0x0000131Ar ); // Cabecote Esqerdo
		inv.insertItem( parts.engines.Ford_302:0x0000132Ar ); // Cabecote Direito
		inv.insertItem( parts.engines.Ford_302:0x0000123Ar ); // Comando
		inv.insertItem( parts.engines.Ford_302:0x00001E21r ); // Tampa cabeçote Esquerda
		inv.insertItem( parts.engines.Ford_302:0x00001E11r ); // Tampa cabeçote Direita
		inv.insertItem( parts.engines.Ford_302:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Ford_302:0x00001A81r ); // Correia Alternador
		inv.insertItem( parts.engines.Ford_302:0x00001C41r ); // Coletor Escape Esquerdo
		inv.insertItem( parts.engines.Ford_302:0x00001C51r ); // Coletor Escape Direito
		inv.insertItem( parts.engines.Ford_302:0x00001A61r ); // Coletor Admissao
		inv.insertItem( parts.engines.Ford_302:0x00001C61r ); // Carburador
		inv.insertItem( parts.engines.Ford_302:0x00001B81r ); // Supercharles
		inv.insertItem( parts.engines.Ford_302:0x00001B71r ); // Polia Supercharles
		inv.insertItem( parts.engines.Ford_302:0x00001B61r ); // Correia Supercharles
		inv.insertItem( parts.engines.Ford_302:0x00001A91r ); // Distribuidor
		inv.insertItem( parts.engines.Ford_302:0x00001A51r ); // Frente Motor
		inv.insertItem( parts.engines.Ford_302:0x00001B41r ); // Bomba Combustivel
		inv.insertItem( parts.engines.Ford_302:0x00001D81r ); // Bomba Dagua
		inv.insertItem( parts.engines.Ford_302:0x00001C81r ); // Filtro
		inv.insertItem( parts.engines.Ford_302:0x00001D51r ); // Nitro
	}
}