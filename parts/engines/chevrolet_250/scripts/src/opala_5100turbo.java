package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class opala_5100turbo extends Set
{
	public opala_5100turbo( int id )
	{
		super( id );
		name = "Motor Opala 5.1 Supercharger";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.chevrolet_250:0x0000111Ar ); // Bloco
		inv.insertItem( parts.engines.chevrolet_250:0x0000111Br ); // Virabrequim
		inv.insertItem( parts.engines.chevrolet_250:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.chevrolet_250:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.chevrolet_250:0x0000127Ar ); // Pistoes
		inv.insertItem( parts.engines.chevrolet_250:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.chevrolet_250:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.chevrolet_250:0x0000769Br ); // Cambio
		inv.insertItem( parts.engines.chevrolet_250:0x00000049r ); // Carter
		inv.insertItem( parts.engines.chevrolet_250:0x0000169Ar ); // Cabecote
		inv.insertItem( parts.engines.chevrolet_250:0x00001A7Br ); // Comando
		inv.insertItem( parts.engines.chevrolet_250:0x00007A11r ); // Tampa Comando
		inv.insertItem( parts.engines.chevrolet_250:0x00008A11r ); // Tampa Tuchos
		inv.insertItem( parts.engines.chevrolet_250:0x00002B21r ); // Tampa Cabecote
		inv.insertItem( parts.engines.chevrolet_250:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.chevrolet_250:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.chevrolet_250:0x00009B11r ); // Coletor Escape
		inv.insertItem( parts.engines.chevrolet_250:0x00002B11r ); // Coletor Admissao
		inv.insertItem( parts.engines.chevrolet_250:0x00007B21r ); // Carburador
		inv.insertItem( parts.engines.chevrolet_250:0x00005B21r ); // Distribuidor
		inv.insertItem( parts.engines.chevrolet_250:0x00003B21r ); // Bomba Combustivel
		inv.insertItem( parts.engines.chevrolet_250:0x00007B31r ); // Bomba Dagua
		inv.insertItem( parts.engines.chevrolet_250:0x00001B31r ); // Balanceiros
		inv.insertItem( parts.engines.chevrolet_250:0x0000666Ar ); // Supercharles
		inv.insertItem( parts.engines.chevrolet_250:0x00001B21r ); // Polia Supercharles
		inv.insertItem( parts.engines.chevrolet_250:0x00007B11r ); // Correia Supercharles
	}
}