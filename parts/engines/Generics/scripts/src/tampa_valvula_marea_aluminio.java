package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_marea_aluminio extends Part
{
	public tampa_valvula_marea_aluminio( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Marea 1.8 16v";
		description = "";

		value = 220;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
