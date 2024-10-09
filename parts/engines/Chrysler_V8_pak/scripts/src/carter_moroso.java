package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class carter_moroso extends OilPan
{
	public carter_moroso( int id )
	{
		super( id );
		name = "Carter Moroso Dodge 318";
		description = "";

		value = 800;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.000269;
		friction_rev = 0.0001345;

		check4warnings();
	}
}
