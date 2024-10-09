package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class c20xe_oil_pan extends OilPan
{
	public c20xe_oil_pan( int id )
	{
		super( id );
		name = "C20XE oil pan";
		description = "";
		brand_new_prestige_value = 25.62;

		value = tHUF2USD(13);
		setMaxWear(kmToMaxWear(500000.0));
		
		capacity	= 5.0;

		friction_fwd = 0.0002;
		friction_rev = 0.0025;

		check4warnings();
	}
}