package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_bomba_dagua extends Part
{
	public correia_bomba_dagua( int id )
	{
		super( id );
		name = "Correia Bomba De Agua Chevrolet 250";
		description = "";

		value = 20;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
