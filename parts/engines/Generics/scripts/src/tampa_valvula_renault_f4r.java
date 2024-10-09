package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_renault_f4r extends Part
{
	public tampa_valvula_renault_f4r( int id )
	{
		super( id );
		name = "Tampa Cabecote Renault 16v";
		description = "";

		value = 350;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
