package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class VR_6_camshaft_bearing_bridge extends SlidingEnginePart
{
	public VR_6_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais De Comando VW VR6";
		description = "";

		value = tHUF2USD(2*12);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
        
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 26 );
		if (!p)
			return "Os Mancais Do Comando esta sem Porcas.";

		return super.isDynoable();
	}
}

