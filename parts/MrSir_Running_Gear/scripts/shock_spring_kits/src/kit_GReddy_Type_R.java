// Author: MisterSir
// Developed: 2010
// File: kit_GReddy_Type_R.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GReddy_Type_R extends Set
{
	public kit_GReddy_Type_R( int id )
	{
		super( id );
		name = "GReddy Type R Coilovers";
		description = "4 GReddy Type R Shocks \n \n4 GReddy Type R Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E61r ); // GReddy Type R Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E61r ); // GReddy Type R Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E61r ); // GReddy Type R Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E61r ); // GReddy Type R Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E15r ); // GReddy Type R Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E15r ); // GReddy Type R Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E15r ); // GReddy Type R Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E15r ); // GReddy Type R Spring
	}
}
