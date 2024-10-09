// Author: MisterSir
// Developed: 2010
// File: kit_HKS_Hipermax_III_Sport.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_HKS_Hipermax_III_Sport extends Set
{
	public kit_HKS_Hipermax_III_Sport( int id )
	{
		super( id );
		name = "HKS Hipermax III Sport Coilovers";
		description = "4 HKS Hipermax III Sport Shocks \n \n4 HKS Hipermax III Sport Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E29r ); // HKS Hipermax III Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E29r ); // HKS Hipermax III Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E29r ); // HKS Hipermax III Sport Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E29r ); // HKS Hipermax III Sport Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E83r ); // HKS Hipermax III Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E83r ); // HKS Hipermax III Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E83r ); // HKS Hipermax III Sport Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E83r ); // HKS Hipermax III Sport Spring
	}
}
