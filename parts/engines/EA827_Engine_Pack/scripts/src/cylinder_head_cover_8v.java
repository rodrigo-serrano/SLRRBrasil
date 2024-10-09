package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_8v extends Part
{
	public cylinder_head_cover_8v( int id )
	{
		super( id );
		name = "Tampa De Cabecote Volkswagen AP 8v";
		description = "";

		value = 55;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
