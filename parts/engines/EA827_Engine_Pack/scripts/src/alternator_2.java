package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class alternator_2 extends EnginePart
{
	public alternator_2( int id )
	{
		super( id );
		name = "Alternador Baixo Volkswagen AP";
		description = "";

		value = 300;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 42 );
		if (!p)
			return "O Alternador esta sem correia.";

		return super.isDynoable();
	}
}
