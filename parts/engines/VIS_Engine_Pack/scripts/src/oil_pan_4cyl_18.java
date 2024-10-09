package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class oil_pan_4cyl_18 extends OilPan
{
	public oil_pan_4cyl_18( int id )
	{
		super( id );
		name = "Carter Fiat V.I.S. 1.8 16v";
		description = "";

		value = 150;
		brand_new_prestige_value = 80.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.000285;
		friction_rev = 0.0001425;

		check4warnings();
	}
}
