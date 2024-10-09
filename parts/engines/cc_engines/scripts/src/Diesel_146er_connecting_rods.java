package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Diesel_146er_connecting_rods extends ConnectingRod
{
	public Diesel_146er_connecting_rods( int id )
	{
		super( id );
		name = "Cummins ISBe4 Turbo connecting rods";

		description = "";

		value = tHUF2USD(4*30);
		brand_new_prestige_value = 39.94;
		setMaxWear(kmToMaxWear(31000000.0));

		piston_slot_ID = 44;

		length = 158.8;

		maxRPM = 9000;
		inertia = kgToInertia(4*0.330);
	}
}
