package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_mopar_magnum extends Part
{
	public filtro_mopar_magnum( int id )
	{
		super( id );
		name = "Filtro De Ar Mopar Magnum Dodge 318";
		description = "";
		brand_new_prestige_value = 17.09;

		value = 300;
		setMaxWear(kmToMaxWear(500000.0));
		check4warnings();

	}
}

