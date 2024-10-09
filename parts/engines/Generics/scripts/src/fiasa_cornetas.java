package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class fiasa_cornetas extends EnginePart
{
	public fiasa_cornetas( int id )
	{
		super( id );
		name = "Cornetas Weber 40 Fiasa";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
