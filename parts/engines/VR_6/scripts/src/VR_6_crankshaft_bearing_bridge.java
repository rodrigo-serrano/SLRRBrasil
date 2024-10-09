package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class VR_6_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public VR_6_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais De Virabrequim VW VR6";
		description = "";

		value = tHUF2USD(90);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 41 );
		if (!p)
			return "Os Mancais De Virabrequim estao sem Porcas.";

		return super.isDynoable();
	}
}
