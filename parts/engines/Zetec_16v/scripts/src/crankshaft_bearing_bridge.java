package java.game.parts.engines.Zetec_16v;

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
		name = "Sobre Carter Zetec 16v";
		description = "";

		value = 120;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
