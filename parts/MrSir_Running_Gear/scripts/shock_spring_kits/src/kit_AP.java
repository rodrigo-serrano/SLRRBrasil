// Author: MisterSir
// Developed: 2010
// File: kit_AP.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_AP extends Set
{
	public kit_AP( int id )
	{
		super( id );
		name = "AP Coilovers";
		description = "4 AP Shocks \n \n4 AP Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E65r ); // AP Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E65r ); // AP Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E65r ); // AP Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E65r ); // AP Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E19r ); // AP Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E19r ); // AP Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E19r ); // AP Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E19r ); // AP Spring
	}
}
