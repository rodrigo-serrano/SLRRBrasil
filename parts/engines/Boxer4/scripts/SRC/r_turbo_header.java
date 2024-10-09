package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class r_turbo_header extends ExhaustHeader
{
	public r_turbo_header( int id )
	{
		super( id );
		name = "Coletor Turbo Direito Subaru EJ";
		description = "";

		value = 400;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(200000.0));

		efficiency = 1.0;

		check4warnings();
	}
}
