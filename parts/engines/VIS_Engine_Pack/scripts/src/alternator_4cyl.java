package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class alternator_4cyl extends EnginePart
{
	public alternator_4cyl( int id )
	{
		super( id );
		name = "Alternador Fiat V.I.S. 1.8 16v";
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
			return "O Alternador esta sem Correia.";

		return super.isDynoable();
	}
}
