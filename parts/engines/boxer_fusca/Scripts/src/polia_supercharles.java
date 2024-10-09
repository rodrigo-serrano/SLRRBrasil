package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class polia_supercharles extends Part
{
	public polia_supercharles( int id )
	{
		super( id );
		name = "Polia Para Supercharger Motor Fusca";
		description = "";
		brand_new_prestige_value = 10;

		value = 180;
		setMaxWear(kmToMaxWear(111000.0));

		check4warnings();
	}


}