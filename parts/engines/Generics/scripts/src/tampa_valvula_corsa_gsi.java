package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_corsa_gsi extends Part
{
	public tampa_valvula_corsa_gsi( int id )
	{
		super( id );
		name = "Tampa Cabecote Familia 1 16v";
		description = "";

		value = 280;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
