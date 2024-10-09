package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape extends ExhaustHeader
{
	public coletor_escape( int id )
	{
		super( id );
		name = "Coletor De Escape Original GM F2 8v";
		description = "";

		value = 100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.80;

		check4warnings();
	}
}
