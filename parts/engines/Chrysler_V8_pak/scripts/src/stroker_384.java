package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class stroker_384 extends Set
{
	public stroker_384( int id )
	{
		super( id );
		name = "Motor Dodge 384 Stroker V8";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000E318r ); // Bloco
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000105r ); // Virabrequim
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A89r ); // Polia
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000AFFr ); // Bielas
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000054r ); // Pistoes
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000100r ); // Volante
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000103r ); // Embreagem
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000107r ); // Cambio
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A48r ); // Carter
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000ADr ); // Cabecote Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000AFr ); // Cabecote Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000C7r ); // Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A6Br ); // Engrenagem Sincronismo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000AB4r ); // Engrenagem Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000097r ); // Corrente Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000BAr ); // Tampa Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000F1Br ); // Tampa Bloco
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000FD5r ); // Tampa Cabecote Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000FD4r ); // Tampa Cabecote Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000096r ); // Alternador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000003B0r ); // Coletor Escape Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000003B2r ); // Coletor Escape Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000A1r ); // Coletor Admissao
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000008Br ); // Carburador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000BB6r ); // Filtro
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A05r ); // Distribuidor
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A99r ); // Filtro Oleo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000047r ); // Bomba Dagua
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000E15r ); // Radiador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000E08r ); // Ventoinha
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000009Ar ); // Correia Alternador
	}
}