package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_fiasa_cromada extends Part
{
	public tampa_valvula_fiasa_cromada( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiasa Cromada";
		description = "";

		value = 200;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
