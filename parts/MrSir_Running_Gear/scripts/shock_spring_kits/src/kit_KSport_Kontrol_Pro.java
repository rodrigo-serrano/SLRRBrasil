// Author: MisterSir
// Developed: 2010
// File: kit_KSport_Kontrol_Pro.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_KSport_Kontrol_Pro extends Set
{
	public kit_KSport_Kontrol_Pro( int id )
	{
		super( id );
		name = "KSport Kontrol Pro Coilovers";
		description = "4 KSport Kontrol Pro Shocks \n \n4 KSport Kontrol Pro Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E37r ); // KSport Kontrol Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E37r ); // KSport Kontrol Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E37r ); // KSport Kontrol Pro Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E37r ); // KSport Kontrol Pro Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E91r ); // KSport Kontrol Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E91r ); // KSport Kontrol Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E91r ); // KSport Kontrol Pro Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E91r ); // KSport Kontrol Pro Spring
	}
}
