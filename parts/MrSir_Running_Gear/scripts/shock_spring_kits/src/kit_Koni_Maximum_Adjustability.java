// Author: MisterSir
// Developed: 2010
// File: kit_Koni_Maximum_Adjustability.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Koni_Maximum_Adjustability extends Set
{
	public kit_Koni_Maximum_Adjustability( int id )
	{
		super( id );
		name = "Koni Maximum Adjustability Coilovers";
		description = "4 Koni Maximum Adjustability Shocks \n \n4 Koni Maximum Adjustability Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E35r ); // Koni Maximum Adjustability Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E35r ); // Koni Maximum Adjustability Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E35r ); // Koni Maximum Adjustability Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E35r ); // Koni Maximum Adjustability Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E89r ); // Koni Maximum Adjustability Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E89r ); // Koni Maximum Adjustability Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E89r ); // Koni Maximum Adjustability Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E89r ); // Koni Maximum Adjustability Spring
	}
}
