package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_3 extends ExhaustHeader
{
	public exhaust_header_3( int id )
	{
		super( id );
		name = "Coletor Turbo Honda Serie K";
		description = "";

		value = 750;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.80;

		check4warnings();
	}
}
