package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class sevel16_16v extends Set
{
	public sevel16_16v( int id )
	{
		super( id );
		name = "Motor Sevel 1.6 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Sevel:0x00000052r ); // Bloco
		inv.insertItem( parts.engines.Sevel:0x00000044r ); // Virabrequim
		inv.insertItem( parts.engines.Sevel:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Sevel:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Sevel:0x00000057r ); // Pistoes
		inv.insertItem( parts.engines.Sevel:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Sevel:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Sevel:0x0000118Fr ); // Cambio
		inv.insertItem( parts.engines.Sevel:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Sevel:0x0000FC01r ); // Cabecote
		inv.insertItem( parts.engines.Sevel:0x0000FC21r ); // Comando adm
		inv.insertItem( parts.engines.Sevel:0x0000FC31r ); // Comando esc
		inv.insertItem( parts.engines.Sevel:0x0000FC51r ); // Mancal Comando
		inv.insertItem( parts.engines.Sevel:0x0000FC61r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Sevel:0x0000FC41r ); // Correia Dentada
		inv.insertItem( parts.engines.Sevel:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Sevel:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Sevel:0x00002FC1r ); // Tampao Bomba Combustivel
		inv.insertItem( parts.engines.Sevel:0x00006AC1r ); // Bomba Dagua
		inv.insertItem( parts.engines.Sevel:0x0000FC81r ); // Coletor Escape
		inv.insertItem( parts.engines.Sevel:0x0000FC11r ); // Coletor Admissao
		inv.insertItem( parts.engines.Sevel:0x0000FC71r ); // Flauta
	}
}