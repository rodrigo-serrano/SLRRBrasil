package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class corneta_weber_lada extends EnginePart
{
	public corneta_weber_lada( int id )
	{
		super( id );
		name = "Cornetas Webers Lada 1.6 8v";
		description = "";

		value = 320;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
