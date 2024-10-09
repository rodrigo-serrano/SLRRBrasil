package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_marea_plastico extends Part
{
	public tampa_valvula_marea_plastico( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Marea 1.8 16v Plastico";
		description = "";

		value = 320;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
