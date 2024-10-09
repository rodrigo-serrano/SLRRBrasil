package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Ishima_alternator extends Part
{
	public Ishima_alternator( int id )
	{
		super( id );
		name = "E.Torq alternator";
		description = "";
		brand_new_prestige_value = 14.52;

		value = tHUF2USD(15);
		setMaxWear(kmToMaxWear(300000.0));
	}
}
