package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Einvagen_oil_pan extends OilPan
{
	public Einvagen_oil_pan( int id )
	{
		super( id );
		name = "Volkswagen VHT/AT oil pan";
		description = "";
		brand_new_prestige_value = 25.62;

		value = tHUF2USD(13);
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
