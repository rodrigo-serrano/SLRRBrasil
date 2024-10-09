package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class tampa_comando_cromada extends SlidingEnginePart
{
	public tampa_comando_cromada( int id )
	{
		super( id );
		name = "Tampa Do Sincronismo Cromada Willys BF-161";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}