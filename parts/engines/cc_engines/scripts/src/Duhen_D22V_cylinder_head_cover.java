package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_D22V_cylinder_head_cover extends Part
{
	public Duhen_D22V_cylinder_head_cover( int id )
	{
		super( id );
		name = "Ford cylinder head cover";
		description = "A stylish aluminium valve cover painted to red with a polished 'Duhen 2.2 DVC' label.";

		value = tHUF2USD(18);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
