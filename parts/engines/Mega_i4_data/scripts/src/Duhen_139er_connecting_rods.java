package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_139er_connecting_rods extends ConnectingRod
{
	public Duhen_139er_connecting_rods( int id )
	{
		super( id );
		name = "Zetec 1.6 connecting rods";

		description = "";

		value = tHUF2USD(4*17);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 128.8;

		maxRPM = 9250;
		inertia = kgToInertia(4*0.350);
	}
}
