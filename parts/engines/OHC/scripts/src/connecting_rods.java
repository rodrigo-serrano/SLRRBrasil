package java.game.parts.engines.OHC;

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
		name = "Bielas OHC";
		description = "";

		value = tHUF2USD(20.117);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(300000.0));

		piston_slot_ID = 39;

		length = 127.8;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.350);

		check4warnings();
	}
}
