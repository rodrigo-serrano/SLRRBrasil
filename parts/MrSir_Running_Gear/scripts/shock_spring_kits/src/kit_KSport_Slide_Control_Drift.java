// Author: MisterSir
// Developed: 2010
// File: kit_KSport_Slide_Control_Drift.java

package java.game.parts.MrSir_Running_Gear;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_KSport_Slide_Control_Drift extends Set
{
	public kit_KSport_Slide_Control_Drift( int id )
	{
		super( id );
		name = "KSport Slide Control Drift Coilovers";
		description = "4 KSport Slide Control Drift Shocks \n \n4 KSport Slide Control Drift Springs";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E41r ); // KSport Slide Control Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E41r ); // KSport Slide Control Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E41r ); // KSport Slide Control Drift Shock
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E41r ); // KSport Slide Control Drift Shock

		inv.insertItem( parts.MrSir_Running_Gear:0x00000E95r ); // KSport Slide Control Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E95r ); // KSport Slide Control Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E95r ); // KSport Slide Control Drift Spring
		inv.insertItem( parts.MrSir_Running_Gear:0x00000E95r ); // KSport Slide Control Drift Spring
	}
}
