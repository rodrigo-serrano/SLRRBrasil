package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class SuperDuty_oil_pan extends OilPan
{
	public SuperDuty_oil_pan( int id )
	{
		super( id );
		name = "Carter Subaru EJ";
		description = "";
		brand_new_prestige_value = 43.01;

		value = 180;
		setMaxWear(kmToMaxWear(426000.0));

		friction_fwd = 0.0003;
		friction_rev = 0.0003;

		check4warnings();
	}
}
