package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover extends Part
{
	public cylinder_head_cover( int id )
	{
		super( id );
		name = "OHC cylinder head cover";
		description = "";

		value = tHUF2USD(10.171);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(10000000.0));

		check4warnings();
	}
}
