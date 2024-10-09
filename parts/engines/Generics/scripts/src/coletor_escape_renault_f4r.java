package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_renault_f4r extends ExhaustHeader
{
	public coletor_escape_renault_f4r( int id )
	{
		super( id );
		name = "Coletor De Escape Renault 16v";
		description = "";

		value = 200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
