package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_fundido extends ExhaustHeader
{
	public coletor_turbo_fundido( int id )
	{
		super( id );
		name = "Coletor De Escape Turbo Fundido Sevel SPA";
		description = "";

		value = 450;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
