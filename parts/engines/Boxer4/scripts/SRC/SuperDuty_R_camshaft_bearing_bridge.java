package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class SuperDuty_R_camshaft_bearing_bridge extends SlidingEnginePart
{
	public SuperDuty_R_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Mancais Comando Lado Direito Subaru EJ";
		description = "";
		brand_new_prestige_value = 57.34;

		value = 114;
		setMaxWear(kmToMaxWear(426000.0));

		check4warnings();
	}
}
