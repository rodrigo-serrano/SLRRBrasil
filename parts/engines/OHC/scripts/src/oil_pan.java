package java.game.parts.engines.OHC;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class oil_pan extends OilPan
{
	public oil_pan( int id )
	{
		super( id );
		name = "OHC oil pan";
		description = "";

		value = tHUF2USD(20.987);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
