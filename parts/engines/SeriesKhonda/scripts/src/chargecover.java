package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class chargecover extends Part
{
	public chargecover( int id )
	{
		super( id );
		name = "Capa Supercharger Honda Serie K";
		description = "i-VTEC";

		value = 180;
		brand_new_prestige_value = 27.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
