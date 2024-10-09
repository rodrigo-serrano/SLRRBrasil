package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class bielas extends ConnectingRod
{
	public bielas( int id )
	{
		super( id );
		name = "Bielas Ford 302";
		description = "";

		value = 2500;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 42;

		length = 129.3;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.690);

		check4warnings();
	}
}
