package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class oil extends Part
{
	public oil( int id )
	{
		super( id );
		name = "Reservatorio Respiro De Oleo Honda Serie K";
		description = "";

		value = 250;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
