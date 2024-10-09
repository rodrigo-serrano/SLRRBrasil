package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_f1 extends ExhaustHeader
{
	public coletor_turbo_f1( int id )
	{
		super( id );
		name = "Coletor Turbo GM Familia 1 8v";
		description = "";

		value = 700;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.15;

		check4warnings();
	}
}
