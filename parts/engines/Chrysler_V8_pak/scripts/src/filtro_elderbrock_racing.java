package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_elderbrock_racing extends Part
{
	public filtro_elderbrock_racing( int id )
	{
		super( id );
		name = "Filtro De Ar Edelbrock Racing Dodge 318";
		description = "";
		brand_new_prestige_value = 17.09;

		value = 300;
		setMaxWear(kmToMaxWear(500000.0));
		check4warnings();

	}
}

