package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_110_GTK_cylinder_head_cover extends Part
{
	public Einvagen_110_GTK_cylinder_head_cover( int id )
	{
		super( id );
		name = "Volkswagen  cylinder head cover";
		description = "";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 59.30;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
