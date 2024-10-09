package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_corsa_gsi extends ExhaustHeader
{
	public coletor_turbo_corsa_gsi( int id )
	{
		super( id );
		name = "Coletor Turbo Binotto Performance GM Familia 1 16v";
		description = "";

		value = 850;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.00;

		check4warnings();
	}
}
