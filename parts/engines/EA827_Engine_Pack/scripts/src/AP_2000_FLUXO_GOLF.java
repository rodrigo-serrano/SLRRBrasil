package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_2000_FLUXO_GOLF extends Set
{
	public AP_2000_FLUXO_GOLF( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 2000 Fluxo Cruzado Golf";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F081r ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000080r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000095r ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F113r ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F056r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000021AAr ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F097r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000057AAr ); // Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F118r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F114r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F105r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F127r ); // Radiator
	}
}