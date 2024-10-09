package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class r_turbo_exhaust extends ExhaustHeader
{
	public r_turbo_exhaust( int id )
	{
		super( id );
		name = "Escapamento Turbina Direita Subaru EJ";
		description = "";

		value = 60;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(200000.0));

		efficiency = 1.0;

		check4warnings();
	}
}
