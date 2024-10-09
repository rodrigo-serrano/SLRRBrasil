package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class vareta extends EnginePart
{
	public vareta( int id )
	{
		super( id );
		name = "Vareta Oleo Motor GM F2 8v";
		description = "";

		value = 65;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
