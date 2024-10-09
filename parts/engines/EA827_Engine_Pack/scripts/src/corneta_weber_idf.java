package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class corneta_weber_idf extends EnginePart
{
	public corneta_weber_idf( int id )
	{
		super( id );
		name = "Cornetas Weber IDF Volkswagen AP";
		description = "";

		value = 110;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
