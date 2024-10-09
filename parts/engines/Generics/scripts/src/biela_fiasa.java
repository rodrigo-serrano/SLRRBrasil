package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class biela_fiasa extends ConnectingRod
{
	public biela_fiasa( int id )
	{
		super( id );
		name = "Bielas Motor Fiasa";
		description = "";

		value = 200;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 130.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.300);

		check4warnings();
	}
}
