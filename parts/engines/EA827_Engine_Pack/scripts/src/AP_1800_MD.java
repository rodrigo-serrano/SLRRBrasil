package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_1800_MD extends Set
{
	public AP_1800_MD( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 1800 Bielinha Gasolina MD-280";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F075r ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F077r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F057r ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F078r ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000025AAr ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F061r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F084r ); // Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F053r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F055r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F052r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F124r ); // Radiator
	}
}