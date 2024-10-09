package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_alternador_endura extends Part
{
	public correia_alternador_endura( int id )
	{
		super( id );
		name = "Correia Alternador Ford Endura";
		description = "";

		value = 25;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(50000.0));

		check4warnings();
	}
}
