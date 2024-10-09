package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class radiador extends EnginePart
{
	public radiador( int id )
	{
		super( id );
		name = "Radiador Willys BF-161";
		description = "";

		value = 220;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}