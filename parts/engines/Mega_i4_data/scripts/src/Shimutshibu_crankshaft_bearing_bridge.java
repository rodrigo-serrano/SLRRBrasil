package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Shimutshibu_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public Shimutshibu_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Powertech crankshaft bearing bridge";
		description = "";

		value = tHUF2USD(70);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(240000.0));
	}
}
