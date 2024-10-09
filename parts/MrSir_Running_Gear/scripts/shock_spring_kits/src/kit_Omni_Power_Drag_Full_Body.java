// Author: MisterSir
// Developed: 2010
// File: kit_Omni_Power_Drag_Full_Body.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Omni_Power_Drag_Full_Body extends Set
{
	public kit_Omni_Power_Drag_Full_Body( int id )
	{
		super( id );
		name = "Omni Power Drag Full Body Coilovers";
		description = "4 Omni Power Drag Full Body Shocks \n \n4 Omni Power Drag Full Body Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E45r ); // Omni Power Drag Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E45r ); // Omni Power Drag Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E45r ); // Omni Power Drag Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E45r ); // Omni Power Drag Full Body Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E99r ); // Omni Power Drag Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E99r ); // Omni Power Drag Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E99r ); // Omni Power Drag Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E99r ); // Omni Power Drag Full Body Spring
	}
}
