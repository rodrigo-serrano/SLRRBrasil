package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_alternador extends Part
{
	public correia_alternador( int id )
	{
		super( id );
		name = "Correia Alternador Motor Sevel";
		description = "";

		value = 50;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
