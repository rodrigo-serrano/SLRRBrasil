package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class DevilsV6_oil_pan extends OilPan
{
	public DevilsV6_oil_pan( int id )
	{
		super( id );
		name = "Carter Universal Motor V6";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 220;
		setMaxWear(kmToMaxWear(300000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
