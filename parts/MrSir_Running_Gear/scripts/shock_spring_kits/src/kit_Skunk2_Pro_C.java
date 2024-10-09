// Author: MisterSir
// Developed: 2010
// File: kit_Skunk2_Pro_C.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Skunk2_Pro_C extends Set
{
	public kit_Skunk2_Pro_C( int id )
	{
		super( id );
		name = "Skunk2 Pro C Coilovers";
		description = "4 Skunk2 Pro C Shocks \n \n4 Skunk2 Pro C Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E49r ); // Skunk2 Pro C Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E49r ); // Skunk2 Pro C Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E49r ); // Skunk2 Pro C Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E49r ); // Skunk2 Pro C Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E03r ); // Skunk2 Pro C Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E03r ); // Skunk2 Pro C Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E03r ); // Skunk2 Pro C Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E03r ); // Skunk2 Pro C Spring
	}
}
