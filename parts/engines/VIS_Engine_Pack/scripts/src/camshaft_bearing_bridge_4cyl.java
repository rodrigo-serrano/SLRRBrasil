package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class camshaft_bearing_bridge_4cyl extends SlidingEnginePart
{
	public camshaft_bearing_bridge_4cyl( int id )
	{
		super( id );
		name = "Mancais Comando Fiat V.I.S. 16v";
		description = "";

		value = 100;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
