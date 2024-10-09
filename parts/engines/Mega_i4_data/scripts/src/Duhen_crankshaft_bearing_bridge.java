package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;



public class Duhen_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public Duhen_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT crankshaft bearing bridge";
		description = "";
		brand_new_prestige_value = 20.12;

		value = tHUF2USD(70);
		setMaxWear(kmToMaxWear(240000.0));
	}
}
