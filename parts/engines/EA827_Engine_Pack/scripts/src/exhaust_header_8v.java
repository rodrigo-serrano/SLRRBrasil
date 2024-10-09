package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_8v extends ExhaustHeader
{
	public exhaust_header_8v( int id )
	{
		super( id );
		name = "Coletor De Escape Original Volkswagen AP 8v";
		description = "";

		value = 100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.83;

		check4warnings();
	}
}
