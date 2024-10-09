package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_tempra16v extends EnginePart
{
	public pressu_tempra16v( int id )
	{
		super( id );
		name = "Pressurizacao Fiat Twin Cam 2.0 16v";
		description = "";

		value = 500;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
