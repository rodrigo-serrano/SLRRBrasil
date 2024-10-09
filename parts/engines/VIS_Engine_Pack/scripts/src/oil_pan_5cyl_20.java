package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class oil_pan_5cyl_20 extends OilPan
{
	public oil_pan_5cyl_20( int id )
	{
		super( id );
		name = "Carter Fiat V.I.S. 2.0 20v";
		description = "";

		value = 250;
		brand_new_prestige_value = 80.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.000260;
		friction_rev = 0.000130;

		check4warnings();
	}
}
