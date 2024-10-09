package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class oil2 extends Part
{
	public oil2( int id )
	{
		super( id );
		name = "Reservatorio Respiro De Oleo Alternativo Honda Serie K";
		description = "";

		value = 250;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
