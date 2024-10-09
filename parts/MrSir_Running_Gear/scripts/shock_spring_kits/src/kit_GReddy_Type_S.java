// Author: MisterSir
// Developed: 2010
// File: kit_GReddy_Type_S.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GReddy_Type_S extends Set
{
	public kit_GReddy_Type_S( int id )
	{
		super( id );
		name = "GReddy Type S Coilovers";
		description = "4 GReddy Type S Shocks \n \n4 GReddy Type S Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E63r ); // GReddy Type S Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E63r ); // GReddy Type S Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E63r ); // GReddy Type S Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E63r ); // GReddy Type S Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E17r ); // GReddy Type S Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E17r ); // GReddy Type S Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E17r ); // GReddy Type S Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E17r ); // GReddy Type S Spring
	}
}
