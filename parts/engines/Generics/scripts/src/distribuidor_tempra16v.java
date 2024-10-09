package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class distribuidor_tempra16v extends EnginePart
{
	public distribuidor_tempra16v( int id )
	{
		super( id );
		name = "Distribuidor Fiat Twin Cam 2.0 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
