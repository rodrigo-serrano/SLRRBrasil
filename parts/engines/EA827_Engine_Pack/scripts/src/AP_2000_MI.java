package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_2000_MI extends Set
{
	public AP_2000_MI( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 2000 Injetado MI";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000007Er ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000080r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000095r ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F113r ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F056r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000D87r ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000081r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F085r ); // Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F117r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F109r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F124r ); // Radiator
	}
}