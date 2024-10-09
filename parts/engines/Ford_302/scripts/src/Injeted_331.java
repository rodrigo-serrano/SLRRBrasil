package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class Injeted_331 extends Set
{
	public Injeted_331( int id )
	{
		super( id );
		name = "Motor Ford 331 Injetado";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Ford_302:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Ford_302:0x00000080r ); // Virabrequim
		inv.insertItem( parts.engines.Ford_302:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Ford_302:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.Ford_302:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.Ford_302:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Ford_302:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Ford_302:0x0000113Ar ); // Cambio
		inv.insertItem( parts.engines.Ford_302:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Ford_302:0x00001A21r ); // Cabecote Esqerdo
		inv.insertItem( parts.engines.Ford_302:0x00001A11r ); // Cabecote Direito
		inv.insertItem( parts.engines.Ford_302:0x0000116Ar ); // Comando
		inv.insertItem( parts.engines.Ford_302:0x00001E61r ); // Tampa cabeçote Esquerda
		inv.insertItem( parts.engines.Ford_302:0x00001E51r ); // Tampa cabeçote Direita
		inv.insertItem( parts.engines.Ford_302:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Ford_302:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Ford_302:0x00001C41r ); // Coletor Escape Esquerdo
		inv.insertItem( parts.engines.Ford_302:0x00001C51r ); // Coletor Escape Direito
		inv.insertItem( parts.engines.Ford_302:0x00001A71r ); // Coletor Admissao
		inv.insertItem( parts.engines.Ford_302:0x00001D41r ); // Carburador
		inv.insertItem( parts.engines.Ford_302:0x00001B51r ); // Distribuidor
		inv.insertItem( parts.engines.Ford_302:0x00001A51r ); // Frente Motor
		inv.insertItem( parts.engines.Ford_302:0x00001B41r ); // Bomba Combustivel
		inv.insertItem( parts.engines.Ford_302:0x00001A41r ); // Bomba Dagua
		inv.insertItem( parts.engines.Ford_302:0x00001B91r ); // Radiador
		inv.insertItem( parts.engines.Ford_302:0x00001C91r ); // Filtro
	}
}