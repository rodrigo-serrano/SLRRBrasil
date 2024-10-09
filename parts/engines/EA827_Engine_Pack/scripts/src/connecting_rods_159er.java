package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods_159er extends ConnectingRod
{
	public connecting_rods_159er( int id )
	{
		super( id );
		name = "Bielas Alta 159mm Volkswagen AP";
		description = "Stock connecting rods for Volkswagen EA-827 engines.";

		value = 300;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 39;

		length = 159.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.480);

		check4warnings();
	}
}
