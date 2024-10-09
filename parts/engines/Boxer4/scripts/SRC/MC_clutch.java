package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_clutch extends Clutch
{
	public MC_clutch( int id )
	{
		super( id );
		name = "Embreagem Subaru EJ20";
		description = "";
		brand_new_prestige_value = 58.53;

		value = 250;
		setMaxWear(kmToMaxWear(426000.0));

		maxRPM = 13000.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}
