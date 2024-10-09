package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class tampa_comando extends SlidingEnginePart
{
	public tampa_comando( int id )
	{
		super( id );
		name = "Tampa Do Sincronismo Chevrolet 250";
		description = "";

		value = 120;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}