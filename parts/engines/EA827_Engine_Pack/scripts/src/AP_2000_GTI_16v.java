package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class AP_2000_GTI_16v extends Set
{
	public AP_2000_GTI_16v( int id )
	{
		super( id );
		name = "Motor Volkswagen AP 2000 16v GTI";
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
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x00000085r ); // Cambio
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F069r ); // Carter
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F098r ); // Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F094r ); // Comando ADM
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F092r ); // Comando ESC
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F088r ); // Mancal Comando
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F101r ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F090r ); // Correia Dentada
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F079r ); // Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F080r ); // Correia Alternador
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F103r ); // Coletor Escape
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F120r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F115r ); // Flauta
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F107r ); // Filtro
		inv.insertItem( parts.engines.EA827_Engine_Pack:0x0000F127r ); // Radiator
	}
}