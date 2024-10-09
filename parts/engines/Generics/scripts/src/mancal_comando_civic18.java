package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class mancal_comando_civic18 extends SlidingEnginePart
{
	public mancal_comando_civic18( int id )
	{
		super( id );
		name = "Mancais Comando Honda 1.8 16v R18";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
