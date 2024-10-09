package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_2 extends ExhaustHeader
{
	public exhaust_header_2( int id )
	{
		super( id );
		name = "Coletor De Escape Original Honda Serie K";
		description = "";

		value = 250;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
