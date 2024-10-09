package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class oil3 extends Part
{
	public oil3( int id )
	{
		super( id );
		name = "Respiro PCV Honda Serie K";
		description = "";

		value = 45.45;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
