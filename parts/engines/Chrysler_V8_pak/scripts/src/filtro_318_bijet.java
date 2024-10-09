package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_318_bijet extends Part
{
	public filtro_318_bijet( int id )
	{
		super( id );
		name = "Filtro De Ar Original Dodge 318";
		description = "";
		brand_new_prestige_value = 17.09;

		value = 150;
		setMaxWear(kmToMaxWear(500000.0));
		check4warnings();

	}
}

