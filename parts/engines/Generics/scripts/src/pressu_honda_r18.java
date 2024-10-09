package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_honda_r18 extends EnginePart
{
	public pressu_honda_r18( int id )
	{
		super( id );
		name = "Pressurizacao Honda 1.8 16v R18";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
