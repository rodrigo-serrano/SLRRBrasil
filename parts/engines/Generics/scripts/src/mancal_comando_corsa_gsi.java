package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class mancal_comando_corsa_gsi extends SlidingEnginePart
{
	public mancal_comando_corsa_gsi( int id )
	{
		super( id );
		name = "Mancais Comando GM Familia 1 16v";
		description = "";

		value = 220;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
