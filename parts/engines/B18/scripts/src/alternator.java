package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class alternator extends EnginePart
{
	public alternator( int id )
	{
		super( id );
		name = "Altenador Honda Serie B";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 42 );
		if (!p)
			return "O Alternador esta sem Correia.";

		return super.isDynoable();
	}
}
