package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class mancal_comando extends SlidingEnginePart
{
	public mancal_comando( int id )
	{
		super( id );
		name = "Mancais Comando Sevel";
		description = "";

		value = 85;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
