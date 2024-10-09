package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class heatshield extends Part
{
	public heatshield( int id )
	{
		super( id );
		name = "Defletor Turbina Titanium Honda Serie K";
		description = "";

		value = 181.81;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
