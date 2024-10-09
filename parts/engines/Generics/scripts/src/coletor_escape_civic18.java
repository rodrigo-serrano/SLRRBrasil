package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_civic18 extends ExhaustHeader
{
	public coletor_escape_civic18( int id )
	{
		super( id );
		name = "Coletor Escape Honda 1.8 16v R18";
		description = "";

		value = 350;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
