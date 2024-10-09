// Author: MisterSir
// Developed: 2010
// File: kit_Omni_Power_Full_Body.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Omni_Power_Full_Body extends Set
{
	public kit_Omni_Power_Full_Body( int id )
	{
		super( id );
		name = "Omni Power Full Body Coilovers";
		description = "4 Omni Power Full Body Shocks \n \n4 Omni Power Full Body Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E47r ); // Omni Power Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E47r ); // Omni Power Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E47r ); // Omni Power Full Body Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E47r ); // Omni Power Full Body Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E01r ); // Omni Power Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E01r ); // Omni Power Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E01r ); // Omni Power Full Body Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E01r ); // Omni Power Full Body Spring
	}
}
