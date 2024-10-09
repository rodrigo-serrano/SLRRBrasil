package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_tubular extends ExhaustHeader
{
	public coletor_turbo_tubular( int id )
	{
		super( id );
		name = "Coletor De Escape Turbo Tubular Sevel Binotto Performance";
		description = "";

		value = 1800;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.30;

		check4warnings();
	}
}
