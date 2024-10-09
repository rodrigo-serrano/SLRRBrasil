package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class bomba_dagua extends EnginePart
{
	public bomba_dagua( int id )
	{
		super( id );
		name = "Bomba De Agua Chevrolet 250";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}