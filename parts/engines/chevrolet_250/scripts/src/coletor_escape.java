package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape extends ExhaustHeader
{
	public coletor_escape( int id )
	{
		super( id );
		name = "Coletor De Escape Original Chevrolet 250";
		description = "";

		value = 160;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
