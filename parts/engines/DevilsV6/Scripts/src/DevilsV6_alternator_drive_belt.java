package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_alternator_drive_belt extends EnginePart
{
	public DevilsV6_alternator_drive_belt( int id )
	{
		super( id );
		name = "Correia Alternador Motor V6";
		description = "";
		brand_new_prestige_value = 5.73;

		value = 100;
		setMaxWear(kmToMaxWear(40000.0));

		check4warnings();
	}
}
