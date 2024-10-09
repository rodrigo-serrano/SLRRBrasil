package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_duplo extends ExhaustHeader
{
	public coletor_escape_duplo( int id )
	{
		super( id );
		name = "Coletor De Escape Duplo Aero Willys 2600";
		description = "";

		value = 350;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.0;

		check4warnings();
	}
}
