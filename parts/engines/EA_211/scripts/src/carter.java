package java.game.parts.engines.EA_211;

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
		name = "Carter EA-211 3 Cilindros";
		description = "";

		value = 240;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0002;
		friction_rev = 0.0004;

		check4warnings();
	}
}
