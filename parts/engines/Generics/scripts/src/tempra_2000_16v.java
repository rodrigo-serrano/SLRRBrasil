package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class tempra_2000_16v extends Set
{
	public tempra_2000_16v( int id )
	{
		super( id );
		name = "Motor Fiat Tempra 2.0 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Generics:0x000083BAr ); // Bloco
		inv.insertItem( parts.engines.Generics:0x000084BAr ); // Virabrequim
		inv.insertItem( parts.engines.Generics:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Generics:0x000085BAr ); // Bielas
		inv.insertItem( parts.engines.Generics:0x000086BAr ); // Pistoes
		inv.insertItem( parts.engines.Generics:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Generics:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Generics:0x000087BAr ); // Cambio
		inv.insertItem( parts.engines.Generics:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Generics:0x0000E491r ); // Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E551r ); // Comando adm
		inv.insertItem( parts.engines.Generics:0x0000E561r ); // Comando escp
		inv.insertItem( parts.engines.Generics:0x0000E501r ); // Mancal Comando
		inv.insertItem( parts.engines.Generics:0x0000E511r ); // Tampa Cabecote
		inv.insertItem( parts.engines.Generics:0x0000E571r ); // Correia Dentada
		inv.insertItem( parts.engines.Generics:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Generics:0x0000E541r ); // Coletor Escape
		inv.insertItem( parts.engines.Generics:0x0000E521r ); // Coletor Admissao
		inv.insertItem( parts.engines.Generics:0x0000E531r ); // Flauta
		inv.insertItem( parts.engines.Generics:0x0000E581r ); // Distribuidor
		inv.insertItem( parts.engines.Generics:0x0000E591r ); // capa vela
		inv.insertItem( parts.engines.Generics:0x0000E611r ); // capa flauta
		inv.insertItem( parts.engines.Generics:0x0000E601r ); // capa correia
	}
}