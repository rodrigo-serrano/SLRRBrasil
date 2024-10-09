// Author: MisterSir
// Developed: 2010
// File: kit_Bilstein_B14.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Bilstein_B14 extends Set
{
	public kit_Bilstein_B14( int id )
	{
		super( id );
		name = "Bilstein B14 PSS Coilovers";
		description = "4 Bilstein B14 PSS Shocks \n \n4 Bilstein B14 PSS Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E21r ); // Bilstein B14 PSS Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E21r ); // Bilstein B14 PSS Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E21r ); // Bilstein B14 PSS Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E21r ); // Bilstein B14 PSS Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E75r ); // Bilstein B14 PSS Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E75r ); // Bilstein B14 PSS Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E75r ); // Bilstein B14 PSS Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E75r ); // Bilstein B14 PSS Spring
	}
}
