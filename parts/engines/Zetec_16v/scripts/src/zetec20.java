package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class zetec20 extends Set
{
	public zetec20( int id )
	{
		super( id );
		name = "Motor Zetec 2.0 16v";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Zetec_16v:0x0000007Er ); // Bloco
		inv.insertItem( parts.engines.Zetec_16v:0x0000007Dr ); // Virabrequim
		inv.insertItem( parts.engines.Zetec_16v:0x0000004Er ); // Mancal Vira
		inv.insertItem( parts.engines.Zetec_16v:0x00000093r ); // Bielas
		inv.insertItem( parts.engines.Zetec_16v:0x00000195r ); // Pistoes
		inv.insertItem( parts.engines.Zetec_16v:0x0000000Ar ); // Volante
		inv.insertItem( parts.engines.Zetec_16v:0x00000043r ); // Embreagem
		inv.insertItem( parts.engines.Zetec_16v:0x00000583r ); // Cambio
		inv.insertItem( parts.engines.Zetec_16v:0x00000049r ); // Carter
		inv.insertItem( parts.engines.Zetec_16v:0x00000042r ); // Cabecote
		inv.insertItem( parts.engines.Zetec_16v:0x00000099r ); // Comando ext
		inv.insertItem( parts.engines.Zetec_16v:0x0000009Ar ); // Comando adm
		inv.insertItem( parts.engines.Zetec_16v:0x00000058r ); // Mancal Comando
		inv.insertItem( parts.engines.Zetec_16v:0x0000009Br ); // Tampa Cabecote
		inv.insertItem( parts.engines.Zetec_16v:0x00000047r ); // Correia Dentada
		inv.insertItem( parts.engines.Zetec_16v:0x0000004Dr ); // Alternador
		inv.insertItem( parts.engines.Zetec_16v:0x00000048r ); // Correia Alternador
		inv.insertItem( parts.engines.Zetec_16v:0x00000098r ); // Coletor Escape
		inv.insertItem( parts.engines.Zetec_16v:0x00000097r ); // Coletor Admissao
		inv.insertItem( parts.engines.Zetec_16v:0x000000E2r ); // Flauta
	}
}