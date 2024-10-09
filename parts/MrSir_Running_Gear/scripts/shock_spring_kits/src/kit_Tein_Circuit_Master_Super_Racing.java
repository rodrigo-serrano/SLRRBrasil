// Author: MisterSir
// Developed: 2010
// File: kit_Tein_Circuit_Master_Super_Racing.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tein_Circuit_Master_Super_Racing extends Set
{
	public kit_Tein_Circuit_Master_Super_Racing( int id )
	{
		super( id );
		name = "Tein Circuit Master Super Racing Coilovers";
		description = "4 Tein Circuit Master Super Racing Shocks \n \n4 Tein Circuit Master Super Racing Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E55r ); // Tein Circuit Master Super Racing Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E55r ); // Tein Circuit Master Super Racing Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E55r ); // Tein Circuit Master Super Racing Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E55r ); // Tein Circuit Master Super Racing Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E09r ); // Tein Circuit Master Super Racing Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E09r ); // Tein Circuit Master Super Racing Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E09r ); // Tein Circuit Master Super Racing Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E09r ); // Tein Circuit Master Super Racing Spring
	}
}
