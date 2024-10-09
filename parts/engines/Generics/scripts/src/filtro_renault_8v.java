package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filtro_renault_8v extends EnginePart
{
	public filtro_renault_8v( int id )
	{
		super( id );
		name = "Filtro Renault 8v";
		description = "";

		value = 170;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
