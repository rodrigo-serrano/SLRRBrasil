package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class DevilsV6_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public DevilsV6_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais Virabrequim Motor V6";
		description = "";
		brand_new_prestige_value = 51.61;

		value = 280;
		setMaxWear(kmToMaxWear(426000.0));

		check4warnings();
	}
}
