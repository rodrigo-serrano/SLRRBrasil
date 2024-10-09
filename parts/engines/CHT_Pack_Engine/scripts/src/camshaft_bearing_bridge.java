package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class camshaft_bearing_bridge extends SlidingEnginePart
{
	public camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais do cabecote motor CHT";
		description = "";

		value = tHUF2USD(5.246);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
