package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class correia_alternador_sembomba extends Part
{
	public correia_alternador_sembomba( int id )
	{
		super( id );
		name = "Correia do altenador sem bomba de agua Ford 302";
		description = "";

		value = 25;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
