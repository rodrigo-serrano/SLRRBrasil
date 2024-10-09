package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Diesel_oil_pan extends OilPan
{
	public Diesel_oil_pan( int id )
	{
		super( id );
		name = "Cummins ISBe4 oil pan";
		description = "";
		brand_new_prestige_value = 22.76;

		value = tHUF2USD(25);
		setMaxWear(kmToMaxWear(50000000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
