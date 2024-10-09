package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_alternator extends EnginePart
{
	public DevilsV6_alternator( int id )
	{
		super( id );
		name = "Alternador Universal Motor V6";
		description = "";
		brand_new_prestige_value = 24.37;

		value = 600;
		setMaxWear(kmToMaxWear(400000.0));

		check4warnings();
	}
}
