package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_mst extends Part
{
	public filtro_mst( int id )
	{
		super( id );
		name = "Filtro";
		description = "";
		brand_new_prestige_value = 17.09;

		value = 100;
		setMaxWear(kmToMaxWear(500000.0));
		check4warnings();

	}
}

