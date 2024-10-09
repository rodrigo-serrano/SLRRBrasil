package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class alternador_dress extends EnginePart
{
	public alternador_dress( int id )
	{
		super( id );
		name = "Alternador Dodge 318";
		description = "";

		value = 650;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

}
