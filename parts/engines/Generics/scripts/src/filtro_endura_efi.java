package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filtro_endura_efi extends EnginePart
{
	public filtro_endura_efi( int id )
	{
		super( id );
		name = "Filtro Ford Endura Monoponto";
		description = "";

		value = 95;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
