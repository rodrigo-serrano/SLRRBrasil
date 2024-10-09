package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods_138er extends ConnectingRod
{
	public connecting_rods_138er( int id )
	{
		super( id );
		name = "Bielas motor CHT 1.0";
		description = "";

		value = tHUF2USD(8.117);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 39;

		length = 138.2;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.690);

		check4warnings();
	}
}
