package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header4 extends ExhaustHeader
{
	public exhaust_header4( int id )
	{
		super( id );
		name = "Coletor Escape Original Honda Serie B";
		description = "";

		value = tHUF2USD(295.704);
		brand_new_prestige_value = 178.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.25;

		check4warnings();
	}
}
