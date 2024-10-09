package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class corneta_weber extends EnginePart
{
	public corneta_weber( int id )
	{
		super( id );
		name = "Cornetas Par Weber DCOE Volkswagen AP";
		description = "";

		value = 220;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
