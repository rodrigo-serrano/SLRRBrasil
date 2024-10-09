package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class dart_318 extends Set
{
	public dart_318( int id )
	{
		super( id );
		name = "Motor Dodge Dart 318 V8";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000E318r ); // Bloco
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000FEr ); // Virabrequim
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000088r ); // Polia
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000FFr ); // Bielas
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000102r ); // Pistoes
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000100r ); // Volante
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000103r ); // Embreagem
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000104r ); // Cambio
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000095r ); // Carter
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000ADr ); // Cabecote Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000AFr ); // Cabecote Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000003r ); // Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A6Br ); // Engrenagem Sincronismo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000AB4r ); // Engrenagem Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000097r ); // Corrente Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000004Fr ); // Tampa Comando
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000F1Br ); // Tampa Bloco
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000044r ); // Tampa Cabecote Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000042r ); // Tampa Cabecote Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000096r ); // Alternador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000B0r ); // Coletor Escape Esquerdo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000B2r ); // Coletor Escape Direito
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000002A1r ); // Coletor Admissao
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x000000A3r ); // Carburador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000086r ); // Filtro
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A02r ); // Distribuidor
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000A99r ); // Filtro Oleo
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000047r ); // Bomba Dagua
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000E15r ); // Radiador
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x00000E08r ); // Ventoinha
		inv.insertItem( parts.engines.Chrysler_V8_pak:0x0000009Ar ); // Correia Alternador
	}
}