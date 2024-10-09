package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class c20xe_belt_cover extends Part
{
	public c20xe_belt_cover( int id )
	{
		super( id );
		name = "C20XE drive belt cover";
		description = "";

		value = tHUF2USD(2.5);
		brand_new_prestige_value = 5.12;
		setMaxWear(kmToMaxWear(18000.0));
	}
}