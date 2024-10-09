package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class biela_honda extends ConnectingRod
{
	public biela_honda( int id )
	{
		super( id );
		name = "Bielas Motor V6 Honda J35";
		description = "";
		brand_new_prestige_value = 71.68;

		value = 700;
		setMaxWear(kmToMaxWear(413000.0));

		maxRPM = 12000.0;

		piston_slot_ID = 42;

		length = 158.5;

		inertia = kgToInertia(6*0.750);

		check4warnings();
	}
}
