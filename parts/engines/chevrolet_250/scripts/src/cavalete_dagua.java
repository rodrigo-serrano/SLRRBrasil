package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class cavalete_dagua extends EnginePart
{
	public cavalete_dagua( int id )
	{
		super( id );
		name = "Cavalete De Agua Chevrolet 250";
		description = "";

		value = 70;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
