package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_fiasa extends ExhaustHeader
{
	public coletor_escape_fiasa( int id )
	{
		super( id );
		name = "Coletor De Escape Original Fiasa";
		description = "";

		value = 100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.80;

		check4warnings();
	}
}
