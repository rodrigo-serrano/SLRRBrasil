package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class ventoinha extends EnginePart
{
	public ventoinha( int id )
	{
		super( id );
		name = "Ventoinha Original Chevrolet 250";
		description = "";

		value = 80;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}