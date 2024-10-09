package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_1800_20v_TURBO extends Set
{
	public AP_1800_20v_TURBO( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 1800 20v Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F077r ); // Virabrequim
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F123r ); // Pistoes
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F113r ); // Volante
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F056r ); // Embreagem
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x000032AAr ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F099r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F095r ); // Comando ADM
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F093r ); // Comando ESC
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F089r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F102r ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F091r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F079r ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F080r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F104r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F121r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F116r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000051r ); // turbo
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000090r ); // intake 1
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000092r ); // intake 2
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000E98r ); // saida turbina
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000004Cr ); // intercooler
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F128r ); // Radiator
	}
}