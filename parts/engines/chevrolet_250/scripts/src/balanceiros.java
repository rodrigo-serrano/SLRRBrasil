package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class balanceiros extends EnginePart
{
	public balanceiros( int id )
	{
		super( id );
		name = "Trem De Valvula Chevrolet 250";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
