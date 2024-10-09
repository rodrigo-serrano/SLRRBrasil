// Author: MisterSir
// Developed: 2010
// File: kit_HandR_RSS_Club_Sport.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_HandR_RSS_Club_Sport extends Set
{
	public kit_HandR_Street_Performance( int id )
	{
		super( id );
		name = "H&R RSS Club Sport Coilovers";
		description = "4 H&R RSS Club Sport Shocks \n \n4 H&R RSS Club Sport Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E25r ); // H&R RSS Club Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E25r ); // H&R RSS Club Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E25r ); // H&R RSS Club Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E25r ); // H&R RSS Club Sport Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E79r ); // H&R RSS Club Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E79r ); // H&R RSS Club Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E79r ); // H&R RSS Club Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E79r ); // H&R RSS Club Sport Spring
	}
}
