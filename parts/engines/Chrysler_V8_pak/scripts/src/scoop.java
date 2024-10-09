package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class scoop extends Part
{
	public scoop( int id )
	{
		super( id );
		name = "Air Scoop";
		description = "";

		brand_new_prestige_value = 15;

		value = 200;
	}
}