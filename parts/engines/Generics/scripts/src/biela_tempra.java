package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class biela_tempra extends ConnectingRod
{
	public biela_tempra( int id )
	{
		super( id );
		name = "Bielas Fiat Twin Cam 2.0";
		description = "";

		value = 350;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 125.00;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.300);

		check4warnings();
	}
}
