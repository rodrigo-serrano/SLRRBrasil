package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class crankshaft_bearing_bridge extends SlidingEnginePart
{
	public crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "B18 HONDA crankshaft bearing bridge";
		description = "";

		value = tHUF2USD(45.021);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
