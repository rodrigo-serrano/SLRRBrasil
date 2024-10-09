package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_duratec extends ExhaustHeader
{
	public coletor_turbo_duratec( int id )
	{
		super( id );
		name = "Coletor Turbo Ford Duratec 16v";
		description = "";

		value = 1800;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.15;

		check4warnings();
	}
}
