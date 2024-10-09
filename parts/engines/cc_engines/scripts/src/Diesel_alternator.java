package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Diesel_alternator extends EnginePart
{
	public Diesel_alternator( int id )
	{
		super( id );
		name = "Cummins ISBe4 Alternator";
		description = "";
		brand_new_prestige_value = 13.50;

		value = tHUF2USD(33);
		setMaxWear(kmToMaxWear(3000000.0));
	}
}
