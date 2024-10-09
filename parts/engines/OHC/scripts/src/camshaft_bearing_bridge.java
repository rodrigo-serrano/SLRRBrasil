package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class camshaft_bearing_bridge extends SlidingEnginePart
{
	public camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "OHC valves";
		description = "8 valves";

		value = tHUF2USD(6.246);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(2500000.0));

		check4warnings();
	}
}
