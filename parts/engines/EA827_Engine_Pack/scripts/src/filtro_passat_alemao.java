package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filtro_passat_alemao extends EnginePart
{
	public filtro_passat_alemao( int id )
	{
		super( id );
		name = "Filtro Passat Alemao Volkswagen AP 8v";
		description = "";

		value = 135;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
