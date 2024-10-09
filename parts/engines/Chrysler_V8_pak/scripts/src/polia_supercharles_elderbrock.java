package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class polia_supercharles_elderbrock extends Pulley
{
	public polia_supercharles_elderbrock( int id )
	{
		super( id );
		name = "Polia Supercharger Dodge 318 V8";
		description = "";
		brand_new_prestige_value = 14.34;

		value = 400;
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 120000.0;

		inertia = kgToInertia(0.05);

		check4warnings();
	}
}
