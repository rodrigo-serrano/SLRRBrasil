package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_mopar_performance extends Part
{
	public filtro_mopar_performance( int id )
	{
		super( id );
		name = "Filtro De Ar Mopar Performance Dodge 318";
		description = "";
		brand_new_prestige_value = 17.09;

		value = 350;
		setMaxWear(kmToMaxWear(500000.0));
		check4warnings();

	}
}

