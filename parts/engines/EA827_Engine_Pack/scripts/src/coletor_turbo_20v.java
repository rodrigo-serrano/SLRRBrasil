package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_20v extends ExhaustHeader
{
	public coletor_turbo_20v( int id )
	{
		super( id );
		name = "Coletor Turbo Binotto Performance Volkswagen AP 20v";
		description = "";

		value = 1500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 3.50;

		check4warnings();
	}
}
