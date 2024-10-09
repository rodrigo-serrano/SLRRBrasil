package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_carbon extends Part
{
	public cylinder_head_cover_carbon( int id )
	{
		super( id );
		name = "Tampa De Valvula Carbono Honda Serie K";
		description = "";

		value = 363.63;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
