package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class oil_pan_1 extends OilPan
{
	public oil_pan_1( int id )
	{
		super( id );
		name = "Carter Com Radiador De Oleo Honda Serie B";
		description = "";

		value = 350;
		brand_new_prestige_value = 80.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
