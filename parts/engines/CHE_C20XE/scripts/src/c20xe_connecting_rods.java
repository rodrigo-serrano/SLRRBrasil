package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class c20xe_connecting_rods extends ConnectingRod
{
	public c20xe_connecting_rods( int id )
	{
		super( id );
		name = "C20XE connecting rods";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 147.8;

		maxRPM = 9500;
		inertia = kgToInertia(4*0.330);
	}
}