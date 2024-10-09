package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class camshaft_bearing_bridge_5cyl extends SlidingEnginePart
{
	public camshaft_bearing_bridge_5cyl( int id )
	{
		super( id );
		name = "Mancais Comando Fiat V.I.S. 20v";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
