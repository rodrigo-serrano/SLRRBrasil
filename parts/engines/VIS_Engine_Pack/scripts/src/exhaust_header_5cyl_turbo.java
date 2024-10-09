package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_5cyl_turbo extends ExhaustHeader
{
	public exhaust_header_5cyl_turbo( int id )
	{
		super( id );
		name = "Coletor De Escape Fiat V.I.S. 20v turbo";
		description = "";

		value = 350;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.93;

		check4warnings();
	}
}
