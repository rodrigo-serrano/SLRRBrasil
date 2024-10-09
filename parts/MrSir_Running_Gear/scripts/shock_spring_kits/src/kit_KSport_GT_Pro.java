// Author: MisterSir
// Developed: 2010
// File: kit_KSport_GT_Pro.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_KSport_GT_Pro extends Set
{
	public kit_KSport_GT_Pro( int id )
	{
		super( id );
		name = "KSport GT Pro Coilovers";
		description = "4 KSport GT Pro Shocks \n \n4 KSport GT Pro Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E39r ); // KSport GT Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E39r ); // KSport GT Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E39r ); // KSport GT Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E39r ); // KSport GT Pro Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E93r ); // KSport GT Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E93r ); // KSport GT Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E93r ); // KSport GT Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E93r ); // KSport GT Pro Spring
	}
}
