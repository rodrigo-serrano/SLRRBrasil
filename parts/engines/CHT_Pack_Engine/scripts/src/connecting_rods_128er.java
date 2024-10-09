package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods_128er extends ConnectingRod
{
	public connecting_rods_128er( int id )
	{
		super( id );
		name = "Bielas motor CHT 1.3/1.4/1.6";
		description = "";

		value = tHUF2USD(10.117);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 39;

		length = 127.8;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.500);

		check4warnings();
	}
}
