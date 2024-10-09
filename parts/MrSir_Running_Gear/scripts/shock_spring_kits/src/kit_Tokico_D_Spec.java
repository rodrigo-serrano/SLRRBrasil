// Author: MisterSir
// Developed: 2010
// File: kit_Tokico_D_Spec.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tokico_D_Spec extends Set
{
	public kit_Tokico_D_Spec( int id )
	{
		super( id );
		name = "Tokico D Spec Coilovers";
		description = "4 Tokico D Spec Shocks \n \n4 Tokico D Spec Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E57r ); // Tokico D Spec Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E57r ); // Tokico D Spec Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E57r ); // Tokico D Spec Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E57r ); // Tokico D Spec Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00001E11r ); // Tokico D Spec Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E11r ); // Tokico D Spec Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E11r ); // Tokico D Spec Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00001E11r ); // Tokico D Spec Spring
	}
}
