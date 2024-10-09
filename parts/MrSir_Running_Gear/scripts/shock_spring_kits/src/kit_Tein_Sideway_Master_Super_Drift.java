// Author: MisterSir
// Developed: 2010
// File: kit_Tein_Sideway_Master_Super_Drift.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tein_Sideway_Master_Super_Drift extends Set
{
	public kit_Tein_Sideway_Master_Super_Drift( int id )
	{
		super( id );
		name = "Tein Sideway Master Super Drift Coilovers";
		description = "4 Tein Sideway Master Super Drift Shocks \n \n4 Tein Sideway Master Super Drift Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E53r ); // Tein Sideway Master Super Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E53r ); // Tein Sideway Master Super Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E53r ); // Tein Sideway Master Super Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E53r ); // Tein Sideway Master Super Drift Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E07r ); // Tein Sideway Master Super Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E07r ); // Tein Sideway Master Super Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E07r ); // Tein Sideway Master Super Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E07r ); // Tein Sideway Master Super Drift Spring
	}
}
