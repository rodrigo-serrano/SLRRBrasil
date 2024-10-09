package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public Einvagen_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Volkswagen VHT/AT crankshaft bearing bridge";
		description = "It's the bearing used in all types of Volkswagen engines. \n It's durability is enough for about the engine's lifetime, but not cheap to change, so take good care of your engine especially the lubrication.";

		value = tHUF2USD(70);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(240000.0));
	}
}
