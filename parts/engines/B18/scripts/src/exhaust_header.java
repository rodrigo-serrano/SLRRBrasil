package java.game.parts.engines.B18;

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
		name = "Coletor Turbo Honda Serie B";
		description = "";

		value = 500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.85;

		check4warnings();
	}
}
