package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class fuel_rail_9 extends Part
{
	public fuel_rail_9( int id )
	{
		super( id );
		name = "Scoop ITBs Honda Serie K";
		description = "";

		value = 150;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
