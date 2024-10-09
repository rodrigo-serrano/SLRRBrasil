// Author: MisterSir
// Developed: 2010
// File: kit_Koni_Sport_Dynamic_Drive.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Koni_Sport_Dynamic_Drive extends Set
{
	public kit_Koni_Sport_Dynamic_Drive( int id )
	{
		super( id );
		name = "Koni Sport Dynamic Drive Coilovers";
		description = "4 Koni Sport Dynamic Drive Shocks \n \n4 Koni Sport Dynamic Drive Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E33r ); // Koni Sport Dynamic Drive Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E33r ); // Koni Sport Dynamic Drive Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E33r ); // Koni Sport Dynamic Drive Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E33r ); // Koni Sport Dynamic Drive Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E87r ); // Koni Sport Dynamic Drive Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E87r ); // Koni Sport Dynamic Drive Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E87r ); // Koni Sport Dynamic Drive Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E87r ); // Koni Sport Dynamic Drive Spring
	}
}
