package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;



public class Diesel_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public Diesel_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Cummins ISBe4 crankshaft bearing bridge";
		description = "";
		brand_new_prestige_value = 27.12;

		value = tHUF2USD(99);
		setMaxWear(kmToMaxWear(24000000.0));
	}
}
