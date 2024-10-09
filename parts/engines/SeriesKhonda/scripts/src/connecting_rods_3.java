package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods_3 extends ConnectingRod
{
	public connecting_rods_3( int id )
	{
		super( id );
		name = "Bielas Originais Honda K24";
		description = "";

		value = 400;
		brand_new_prestige_value = 20;
		setMaxWear(kmToMaxWear(320000.0));

		piston_slot_ID = 39;

		length = 152.0;

		maxRPM = 12000.0;
		inertia = kgToInertia(6);

		check4warnings();
	}
}