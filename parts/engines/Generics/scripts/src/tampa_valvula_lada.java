package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_lada extends Part
{
	public tampa_valvula_lada( int id )
	{
		super( id );
		name = "Tampa Cabecote Lada 1.6 8v";
		description = "";

		value = 85;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
