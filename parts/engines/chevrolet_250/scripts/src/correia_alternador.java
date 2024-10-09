package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_alternador extends Part
{
	public correia_alternador( int id )
	{
		super( id );
		name = "Correia Alternador Chevrolet 250";
		description = "";

		value = 35;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
