package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class water_pump extends EnginePart
{
	public water_pump( int id )
	{
		super( id );
		name = "Bomba De Agua Subaru EJ";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

}
