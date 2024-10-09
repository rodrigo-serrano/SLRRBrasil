package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_146er_connecting_rods extends ConnectingRod
{
	public Ishima_146er_connecting_rods( int id )
	{
		super( id );
		name = "Fiat 1.8 8v connecting rods";
		description = "FOR E.TORQ ONLY. This is original Powertech 1.8 connecting rods.";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 138.5;

		maxRPM = 9500;
		inertia = kgToInertia(4*0.330);
	}
}
