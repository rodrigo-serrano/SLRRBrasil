package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_esquerdo extends ExhaustHeader
{
	public coletor_escape_esquerdo( int id )
	{
		super( id );
		name = "Coletor De Escape Esquerdo Original Dodge 318";
		description = "";

		value = 200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.25;

		check4warnings();
	}
}
