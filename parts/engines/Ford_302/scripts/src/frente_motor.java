package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class frente_motor extends EnginePart
{
	public frente_motor( int id )
	{
		super( id );
		name = "Frente Motor Ford 302";
		description = "";

		value = 550;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 92 );
		if (!p)
			return "O Motor esta sem Bomba De Agua.";

		p = partOnSlot( 93 );
		if (!p)
			return "O Motor esta sem Bomba De Combustivel.";

		return super.isDynoable();
	}
}
