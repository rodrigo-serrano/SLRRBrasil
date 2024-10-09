package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class mancal_comando_lada extends SlidingEnginePart
{
	public mancal_comando_lada( int id )
	{
		super( id );
		name = "Mancais Comando Lada 1.6 8v";
		description = "";

		value = 50;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
