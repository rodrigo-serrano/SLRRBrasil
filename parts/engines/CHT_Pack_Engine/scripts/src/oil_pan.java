package java.game.parts.engines.CHT_Pack_Engine;

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
		name = "Carter motor CHT";
		description = "";

		value = tHUF2USD(35.987);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0002;
		friction_rev = 0.0004;

		check4warnings();
	}
}
