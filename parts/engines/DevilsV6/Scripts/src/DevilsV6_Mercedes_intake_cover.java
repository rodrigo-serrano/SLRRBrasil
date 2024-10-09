package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class DevilsV6_Mercedes_intake_cover extends Part
{
	public DevilsV6_Mercedes_intake_cover( int id )
	{
		super( id );
		name = "Capa Do Motor V6 Mercedes";
		description = "";
		brand_new_prestige_value = 28.67;

		value = 300;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}
