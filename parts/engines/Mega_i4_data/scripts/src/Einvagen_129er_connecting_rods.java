package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_129er_connecting_rods extends ConnectingRod
{
	public Einvagen_129er_connecting_rods( int id )
	{
		super( id );
		name = "Volkswagen EA-113 connecting rods";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 159.0;

		maxRPM = 9250;
		inertia = kgToInertia(4*0.370);
	}
}
