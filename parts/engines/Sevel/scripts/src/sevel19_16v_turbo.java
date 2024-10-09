package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class sevel19_16v_turbo extends Set
{
	public sevel19_16v_turbo( int id )
	{
		super( id );
		name = "Motor Sevel 1.9 16v Turbo";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Sevel:0x0000BA1Ar ); // Bloco
		inv.insertItem( parts.engines.Sevel:0x0000111Cr ); // Virabrequim
		inv.insertItem( parts.engines.Sevel:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Sevel:0x00000056r ); // Bielas
		inv.insertItem( parts.engines.Sevel:0x0000179Fr ); // Pistoes
		inv.insertItem( parts.engines.Sevel:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Sevel:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Sevel:0x0000161Br ); // Cambio
		inv.insertItem( parts.engines.Sevel:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Sevel:0x0000165Br ); // Cabecote
		inv.insertItem( parts.engines.Sevel:0x0000166Br ); // Comando adm
		inv.insertItem( parts.engines.Sevel:0x0000167Br ); // Comando esc
		inv.insertItem( parts.engines.Sevel:0x0000FC51r ); // Mancal Comando
		inv.insertItem( parts.engines.Sevel:0x0000FC61r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Sevel:0x0000FC41r ); // Correia Dentada
		inv.insertItem( parts.engines.Sevel:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Sevel:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Sevel:0x00002FC1r ); // Tampao Bomba Combustivel
		inv.insertItem( parts.engines.Sevel:0x00006AC1r ); // Bomba Dagua
		inv.insertItem( parts.engines.Sevel:0x0000FA81r ); // Coletor Escape
		inv.insertItem( parts.engines.Sevel:0x0000FC11r ); // Coletor Admissao
		inv.insertItem( parts.engines.Sevel:0x0000FC71r ); // Flauta
		inv.insertItem( parts.engines.Sevel:0x0000FC91r ); // Turbina
		inv.insertItem( parts.engines.Sevel:0x0000F101r ); // Pressurizacao
	}
}