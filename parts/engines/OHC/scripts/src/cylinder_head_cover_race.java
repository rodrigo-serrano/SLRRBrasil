package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_race extends Part
{
	public cylinder_head_cover_race( int id )
	{
		super( id );
		name = "OHC Sport racing cylinder head cover";
		description = "";

		value = tHUF2USD(30.88);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(10000000.0));

		check4warnings();
	}
}
