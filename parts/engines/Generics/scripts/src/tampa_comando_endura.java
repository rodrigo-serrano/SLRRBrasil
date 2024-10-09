package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class tampa_comando_endura extends EnginePart
{
	public tampa_comando_endura( int id )
	{
		super( id );
		name = "Tampa Comando Ford Endura";
		description = "";

		value = 120;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
