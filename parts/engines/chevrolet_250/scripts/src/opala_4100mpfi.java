package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class opala_4100mpfi extends Set
{
	public opala_4100mpfi( int id )
	{
		super( id );
		name = "Motor Omega 4.1 MPFI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.chevrolet_250:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.chevrolet_250:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.chevrolet_250:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.chevrolet_250:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.chevrolet_250:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.chevrolet_250:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.chevrolet_250:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.chevrolet_250:0x0000879Br ); // Cambio
		inv.insertItem( parts.engines.chevrolet_250:0x00000049r ); // Carter
		inv.insertItem( parts.engines.chevrolet_250:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.chevrolet_250:0x00006A6Ar ); // Comando
		inv.insertItem( parts.engines.chevrolet_250:0x00007A11r ); // Tampa Comando
		inv.insertItem( parts.engines.chevrolet_250:0x00008A11r ); // Tampa Tuchos
		inv.insertItem( parts.engines.chevrolet_250:0x00009F21r ); // Tampa Cabecote
		inv.insertItem( parts.engines.chevrolet_250:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.chevrolet_250:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.chevrolet_250:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.chevrolet_250:0x00009F31r ); // Coletor Admissao
		inv.insertItem( parts.engines.chevrolet_250:0x00009F41r ); // Bicos Injetores
		inv.insertItem( parts.engines.chevrolet_250:0x00005A11r ); // Distribuidor
		inv.insertItem( parts.engines.chevrolet_250:0x00003B21r ); // Bomba Combustivel
		inv.insertItem( parts.engines.chevrolet_250:0x00002A11r ); // Bomba Dagua
		inv.insertItem( parts.engines.chevrolet_250:0x00004A11r ); // Correia Bomba Dagua
		inv.insertItem( parts.engines.chevrolet_250:0x00009A11r ); // Ventoinha
		inv.insertItem( parts.engines.chevrolet_250:0x00006A11r ); // Radiador
		inv.insertItem( parts.engines.chevrolet_250:0x00009B21r ); // Balanceiros
		inv.insertItem( parts.engines.chevrolet_250:0x00001B11r ); // Cavalete Dagua
	}
}