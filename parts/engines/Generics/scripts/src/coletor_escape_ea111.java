package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_ea111 extends ExhaustHeader
{
	public coletor_escape_ea111( int id )
	{
		super( id );
		name = "Coletor De Escape Vw Ea111";
		description = "";

		value = 150;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
