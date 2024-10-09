package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class msi_1000 extends Set
{
	public msi_1000( int id )
	{
		super( id );
		name = "Motor EA-211 Msi 1.0 12v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.EA_211:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.EA_211:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.EA_211:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.EA_211:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.EA_211:0x00000096r ); // Pistoes
		inv.insertItem( parts.engines.EA_211:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.EA_211:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.EA_211:0x00000A02r ); // Cambio
		inv.insertItem( parts.engines.EA_211:0x00000049r ); // Carter
		inv.insertItem( parts.engines.EA_211:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.EA_211:0x0000009Ar ); // Comando adm
		inv.insertItem( parts.engines.EA_211:0x0000AA20r ); // Comando esc
		inv.insertItem( parts.engines.EA_211:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.EA_211:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.EA_211:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.EA_211:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.EA_211:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.EA_211:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.EA_211:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.EA_211:0x000000E2r ); // Flauta
		inv.insertItem( parts.engines.EA_211:0x00000ABCr ); // Filtro
	}
}