// Author: MisterSir
// Developed: 2010
// File: kit_HandR_Ultra_Low.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_HandR_Ultra_Low extends Set
{
	public kit_HandR_Ultra_Low( int id )
	{
		super( id );
		name = "H&R Ultra Low Coilovers";
		description = "4 H&R Ultra Low Shocks \n \n4 H&R Ultra Low Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E27r ); // H&R Ultra Low Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E27r ); // H&R Ultra Low Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E27r ); // H&R Ultra Low Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E27r ); // H&R Ultra Low Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E81r ); // H&R Ultra Low Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E81r ); // H&R Ultra Low Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E81r ); // H&R Ultra Low Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E81r ); // H&R Ultra Low Spring
	}
}
