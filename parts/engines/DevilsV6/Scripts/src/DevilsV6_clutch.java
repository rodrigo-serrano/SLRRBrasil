package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class DevilsV6_clutch extends Clutch
{
	public DevilsV6_clutch( int id )
	{
		super( id );
		name = "Embreagem Motor V6";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 700;
		setMaxWear(kmToMaxWear(426000.0));

		maxRPM = 20000.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}
