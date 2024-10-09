package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class carter extends OilPan
{
	public carter( int id )
	{
		super( id );
		name = "Carter Motor Fusca";
		description = "";
		brand_new_prestige_value = 20;

		value = 35;
		setMaxWear(kmToMaxWear(126000.0));

		capacity	= 5.0;

		friction_fwd = 0.0006;
		friction_rev = 0.0003;

		check4warnings();
	}
}