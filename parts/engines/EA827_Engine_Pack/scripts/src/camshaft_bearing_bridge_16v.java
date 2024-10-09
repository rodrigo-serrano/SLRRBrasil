package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class camshaft_bearing_bridge_16v extends SlidingEnginePart
{
	public camshaft_bearing_bridge_16v( int id )
	{
		super( id );
		name = "Mancais Comando Volkswagen AP 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
