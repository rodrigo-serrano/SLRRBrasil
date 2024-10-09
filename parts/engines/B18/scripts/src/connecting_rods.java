package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods extends ConnectingRod
{
	public connecting_rods( int id )
	{
		super( id );
		name = "Bielas Honda Serie B";
		description = "";

		value = 400;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 132.5;

		maxRPM = 8500.0;
		inertia = kgToInertia(6*0.300);

		check4warnings();
	}
}