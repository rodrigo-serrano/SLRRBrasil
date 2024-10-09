package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class defletor_escape_endura extends EnginePart
{
	public defletor_escape_endura( int id )
	{
		super( id );
		name = "Defletor Escape Ford Endura";
		description = "";

		value = 75;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
