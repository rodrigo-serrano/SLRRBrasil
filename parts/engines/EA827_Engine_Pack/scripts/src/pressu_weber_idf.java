package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_weber_idf extends EnginePart
{
	public pressu_weber_idf( int id )
	{
		super( id );
		name = "Pressurizacao Weber IDF Volkswagen AP 8v";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
