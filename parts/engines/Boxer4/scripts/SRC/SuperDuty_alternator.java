package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class SuperDuty_alternator extends EnginePart
{
	public SuperDuty_alternator( int id )
	{
		super( id );
		name = "Alternador Subaru EJ";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
