package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header extends ExhaustHeader
{
	public exhaust_header( int id )
	{
		super( id );
		name = "Coletor de exaustao motor CHT";
		description = "";

		value = tHUF2USD(20.704);
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.83;

		check4warnings();
	}
}
