package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_129er_connecting_rods extends ConnectingRod
{
	public Ishima_129er_connecting_rods( int id )
	{
		super( id );
		name = "E.Torq 1.6 16v connecting rods";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 138.8;

		maxRPM = 9500;
		inertia = kgToInertia(4*0.330);
	}
}
