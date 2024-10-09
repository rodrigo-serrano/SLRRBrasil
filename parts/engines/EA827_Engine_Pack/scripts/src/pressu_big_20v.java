package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_big_20v extends EnginePart
{
	public pressu_big_20v( int id )
	{
		super( id );
		name = "Pressurizacao Hx50 Volkswagen AP 20v";
		description = "";

		value = 400;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
