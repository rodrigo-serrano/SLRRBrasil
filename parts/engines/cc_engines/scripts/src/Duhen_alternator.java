package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_alternator extends EnginePart
{
	public Duhen_alternator( int id )
	{
		super( id );
		name = "Endura-E/Zetec Rocam 1.0 Alternator";
		description = "";
		brand_new_prestige_value = 9.50;

		value = tHUF2USD(15);
		setMaxWear(kmToMaxWear(300000.0));
	}
}
