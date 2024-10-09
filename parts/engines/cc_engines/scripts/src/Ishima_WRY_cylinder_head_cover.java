package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Ishima_WRY_cylinder_head_cover extends Part
{
	public Ishima_WRY_cylinder_head_cover( int id )
	{
		super( id );
		name = "Fire cylinder head cover";
		description = "An aluminium valve cover painted to red with the Ishima and WRY logos painted silver.";

		value = tHUF2USD(18);
		brand_new_prestige_value = 39.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
