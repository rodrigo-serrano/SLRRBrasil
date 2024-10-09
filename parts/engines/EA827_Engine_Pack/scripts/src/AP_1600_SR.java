package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_1600_SR extends Set
{
	public AP_1600_SR( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 1600 Aluminio SR";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000013AAr ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000012AAr ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000014AAr ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F113r ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F056r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000021AAr ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F086r ); // Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F117r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F109r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F126r ); // Radiator
	}
}