// Author: MisterSir
// Developed: 2010
// File: kit_HandR_Street_Performance.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_HandR_Street_Performance extends Set
{
	public kit_HandR_Street_Performance( int id )
	{
		super( id );
		name = "H&R Street Performance Coilovers";
		description = "4 H&R Street Performance Shocks \n \n4 H&R Street Performance Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E23r ); // H&R Street Performance Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E23r ); // H&R Street Performance Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E23r ); // H&R Street Performance Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E23r ); // H&R Street Performance Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E77r ); // H&R Street Performance Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E77r ); // H&R Street Performance Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E77r ); // H&R Street Performance Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E77r ); // H&R Street Performance Spring
	}
}
