package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class oil_pan_AP extends OilPan
{
	public oil_pan_AP( int id )
	{
		super( id );
		name = "Carter Volkswagen AP";
		description = "Stock oil pan for Volkswagen AP engines.";

		value = 100;
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.000269;
		friction_rev = 0.0001345;

		check4warnings();
	}
}
