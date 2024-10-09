package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class Diesel_camshaft_bearing_bridge extends SlidingEnginePart
{
	public Diesel_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Cummins ISBe4 camshaft bearing bridge";
		description = "";

		value = tHUF2USD(2*12);
		brand_new_prestige_value = 32.35;
		setMaxWear(kmToMaxWear(25000000.0));
	}
}
