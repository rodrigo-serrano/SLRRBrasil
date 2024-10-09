// Author: MisterSir
// Developed: 2010
// File: kit_KSport_Circuit_Pro.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_KSport_Circuit_Pro extends Set
{
	public kit_KSport_Circuit_Pro( int id )
	{
		super( id );
		name = "KSport Circuit Pro Coilovers";
		description = "4 KSport Circuit Pro Shocks \n \n4 KSport Circuit Pro Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E43r ); // KSport Circuit Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E43r ); // KSport Circuit Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E43r ); // KSport Circuit Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E43r ); // KSport Circuit Pro Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E97r ); // KSport Circuit Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E97r ); // KSport Circuit Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E97r ); // KSport Circuit Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E97r ); // KSport Circuit Pro Spring
	}
}
