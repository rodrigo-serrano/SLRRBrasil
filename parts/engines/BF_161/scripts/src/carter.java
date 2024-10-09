package java.game.parts.engines.BF_161;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class carter extends OilPan
{
	public carter( int id )
	{
		super( id );
		name = "Carter Willys BF-161";
		description = "";

		value = 120;
		brand_new_prestige_value = 80.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
