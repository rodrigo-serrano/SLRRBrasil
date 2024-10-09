package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_connecting_rods extends ConnectingRod
{
	public MC_connecting_rods( int id )
	{
		super( id );
		name = "Bielas Subaru EJ25";
		description = "";
		brand_new_prestige_value = 71.68;

		value = 450;
		setMaxWear(kmToMaxWear(1413000.0));

		maxRPM = 11250.0;

		piston_slot_ID = 42;

		length = 157.20;

		inertia = kgToInertia(40*0.750);

		check4warnings();
	}
}