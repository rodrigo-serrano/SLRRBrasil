package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_marea_1800 extends Set
{
	public kit_marea_1800( int id )
	{
		super( id );
		name = "Motor Fiat V.I.S. 1.8 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x000000BCr ); // Cambio
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000049r ); // Carter
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F035r ); // Comando escape
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000099r ); // Comando admissao
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x000000E2r ); // flauta
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000ABCr ); // Filtro
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x0000F036r ); // Radiator
		inv.insertItem( parts.engines.VIS_Engine_Pack:0x00000047r ); // Correia Dentada
	}
}