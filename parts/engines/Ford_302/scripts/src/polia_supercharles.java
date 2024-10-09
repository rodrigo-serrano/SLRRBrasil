package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class polia_supercharles extends Pulley
{
	public polia_supercharles( int id )
	{
		super( id );
		name = "Polia Supercharger Ford 302";
		description = "";
		brand_new_prestige_value = 14.34;

		value = 1500;
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 120000.0;

		inertia = kgToInertia(0.05);

		check4warnings();
	}
}
