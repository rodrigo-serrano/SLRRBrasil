package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_honda_r18 extends ExhaustHeader
{
	public coletor_turbo_honda_r18( int id )
	{
		super( id );
		name = "Coletor Turbo Honda 1.8 16v R18";
		description = "";

		value = 650;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.25;

		check4warnings();
	}
}
