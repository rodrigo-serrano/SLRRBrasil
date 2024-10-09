// Author: MisterSir
// Developed: 2010
// File: kit_HKS_Hipermax_Drag.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_HKS_Hipermax_Drag extends Set
{
	public kit_HKS_Hipermax_Drag( int id )
	{
		super( id );
		name = "HKS Hipermax Drag Coilovers";
		description = "4 HKS Hipermax Drag Shocks \n \n4 HKS Hipermax Drag Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E31r ); // HKS Hipermax Drag Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E31r ); // HKS Hipermax Drag Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E31r ); // HKS Hipermax Drag Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E31r ); // HKS Hipermax Drag Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E85r ); // HKS Hipermax Drag Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E85r ); // HKS Hipermax Drag Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E85r ); // HKS Hipermax Drag Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E85r ); // HKS Hipermax Drag Spring
	}
}
