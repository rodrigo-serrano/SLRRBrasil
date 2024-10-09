package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_escape_simples extends ExhaustHeader
{
	public coletor_escape_simples( int id )
	{
		super( id );
		name = "Coletor De Escape Original Willys BF-161";
		description = "";

		value = 100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.0;

		check4warnings();
	}
}
