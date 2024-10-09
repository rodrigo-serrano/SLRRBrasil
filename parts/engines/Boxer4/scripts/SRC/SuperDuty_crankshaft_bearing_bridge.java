package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class SuperDuty_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public SuperDuty_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais Virabrequim Subaru EJ";
		description = "";
		brand_new_prestige_value = 51.61;

		value = 190;
		setMaxWear(kmToMaxWear(426000.0));

		check4warnings();
	}
}
