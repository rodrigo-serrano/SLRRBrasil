package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_passat extends Part
{
	public tampa_valvula_passat( int id )
	{
		super( id );
		name = "Tampa De Cabecote Volkswagen AP 8v Passat Alemao";
		description = "";

		value = 500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
