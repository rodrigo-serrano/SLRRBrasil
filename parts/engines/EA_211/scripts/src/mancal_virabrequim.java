package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class mancal_virabrequim extends SlidingEnginePart
{
	public mancal_virabrequim( int id )
	{
		super( id );
		name = "Mancais Virabrequim EA-211 3 Cilindros";
		description = "";

		value = 180;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
