package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filter_carburetor extends EnginePart
{
	public filter_carburetor( int id )
	{
		super( id );
		name = "Filtro Carburado Volkswagen AP 8v";
		description = "";

		value = 80;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
