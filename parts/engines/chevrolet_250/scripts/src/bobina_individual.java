package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class bobina_individual extends EnginePart
{
	public bobina_individual( int id )
	{
		super( id );
		name = "Bobinas Individuais Chevrolet 250";
		description = "";

		value = 800;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
