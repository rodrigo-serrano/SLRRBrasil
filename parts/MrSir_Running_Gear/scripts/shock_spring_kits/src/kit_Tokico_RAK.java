// Author: MisterSir
// Developed: 2010
// File: kit_Tokico_RAK.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tokico_RAK extends Set
{
	public kit_Tokico_RAK( int id )
	{
		super( id );
		name = "Tokico RAK Coilovers";
		description = "4 Tokico RAK Shocks \n \n4 Tokico RAK Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E59r ); // Tokico RAK Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E59r ); // Tokico RAK Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E59r ); // Tokico RAK Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E59r ); // Tokico RAK Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E13r ); // Tokico RAK Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E13r ); // Tokico RAK Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E13r ); // Tokico RAK Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E13r ); // Tokico RAK Spring
	}
}
