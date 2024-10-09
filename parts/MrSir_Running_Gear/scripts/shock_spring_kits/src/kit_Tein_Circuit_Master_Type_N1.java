// Author: MisterSir
// Developed: 2010
// File: kit_Tein_Circuit_Master_Type_N1.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tein_Circuit_Master_Type_N1 extends Set
{
	public kit_Tein_Circuit_Master_Type_N1( int id )
	{
		super( id );
		name = "Tein Circuit Master Type N1 Coilovers";
		description = "4 Tein Circuit Master Type N1 Shocks \n \n4 Tein Circuit Master Type N1 Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E51r ); // Tein Circuit Master Type N1 Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E51r ); // Tein Circuit Master Type N1 Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E51r ); // Tein Circuit Master Type N1 Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E51r ); // Tein Circuit Master Type N1 Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E05r ); // Tein Circuit Master Type N1 Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E05r ); // Tein Circuit Master Type N1 Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E05r ); // Tein Circuit Master Type N1 Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E05r ); // Tein Circuit Master Type N1 Spring
	}
}
