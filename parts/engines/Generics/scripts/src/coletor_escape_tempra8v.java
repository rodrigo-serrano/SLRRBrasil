package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_tempra8v extends ExhaustHeader
{
	public coletor_escape_tempra8v( int id )
	{
		super( id );
		name = "Coletor De Escape Fiat Twin Cam 2.0 8v";
		description = "";

		value = 100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
