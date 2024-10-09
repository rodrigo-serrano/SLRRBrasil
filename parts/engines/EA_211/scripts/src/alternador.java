package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class alternador extends EnginePart
{
	public alternador( int id )
	{
		super( id );
		name = "Altenador EA-211 3 Cilindros";
		description = "";

		value = 700;
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
