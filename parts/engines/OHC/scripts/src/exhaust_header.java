package java.game.parts.engines.OHC;

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
		name = "OHC exhaust header";
		description = "";

		value = tHUF2USD(25.704);
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(3300000.0));

		efficiency = 0.85;

		check4warnings();
	}
}
