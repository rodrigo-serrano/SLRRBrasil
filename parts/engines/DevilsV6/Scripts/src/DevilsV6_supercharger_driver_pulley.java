package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class DevilsV6_supercharger_driver_pulley extends Pulley
{
	public DevilsV6_supercharger_driver_pulley( int id )
	{
		super( id );
		name = "Polia Supercharger Motor V6";
		description = "";
		brand_new_prestige_value = 14.34;

		value = 200;
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 120000.0;

		inertia = kgToInertia(0.05);

		check4warnings();
	}
}
