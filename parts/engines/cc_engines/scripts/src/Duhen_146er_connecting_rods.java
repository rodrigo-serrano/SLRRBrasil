package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_146er_connecting_rods extends ConnectingRod
{
	public Duhen_146er_connecting_rods( int id )
	{
		super( id );
		name = "Zetec Rocam 1.0/ Endura-E 1.0 connecting rods";

		description = "";

		value = tHUF2USD(4*17);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 127.8;

		maxRPM = 9000;
		inertia = kgToInertia(4*0.330);
	}
}
