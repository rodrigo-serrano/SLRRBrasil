package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class crankshaft_bearing_bridge_4cyl extends SlidingEnginePart
{
	public crankshaft_bearing_bridge_4cyl( int id )
	{
		super( id );
		name = "Mancais Virabrequim Fiat V.I.S. 16v";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
