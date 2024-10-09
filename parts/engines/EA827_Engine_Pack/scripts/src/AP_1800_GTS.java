package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_1800_GTS extends Set
{
	public AP_1800_GTS( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 1800 Carburado Alcool GTS";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F077r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000016AAr ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F113r ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F056r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000032AAr ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F082r ); // Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F053r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F096r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F052r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F124r ); // Radiator
	}
}