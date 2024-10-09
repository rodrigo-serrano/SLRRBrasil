package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_marea_2000_turbo extends Set
{
	public kit_marea_2000_turbo( int id )
	{
		super( id );
		name = "Motor Fiat V.I.S. 2.0 20v Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F003r ); // Bloco
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F013r ); // Virabrequim
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F015r ); // Mancal Vira
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F012r ); // Bielas
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F029r ); // Pistoes
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F011r ); // Embreagem
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F033r ); // Cambio
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F027r ); // Carter
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F016r ); // Cabecote
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F007r ); // Comando escape
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F009r ); // Comando admissao
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F005r ); // Mancal Comando
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F020r ); // Tampa Cabecote
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F001r ); // Alternador
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F002r ); // Correia Alternador
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F026r ); // Coletor Admissao
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F023r ); // Coletor Escape
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000051r ); // Turbina
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F025r ); // flauta
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000004Ar ); // Filtro
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F038r ); // Radiator
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F037r ); // Radiator Oleo
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F006r ); // Correia Dentada
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000092r ); // Pipe 1
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000090r ); // Pipe 2
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000E98r ); // toco
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000004Cr ); // Intercooler
	}
}