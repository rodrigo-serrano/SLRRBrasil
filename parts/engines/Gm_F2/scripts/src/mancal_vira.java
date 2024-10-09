package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class mancal_vira extends SlidingEnginePart
{
	public mancal_vira( int id )
	{
		super( id );
		name = "Mancais Virabrequim GM F2";
		description = "";

		value = 135;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
