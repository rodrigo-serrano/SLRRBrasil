package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bielas extends ConnectingRod
{
	public bielas( int id )
	{
		super( id );
		name = "Bielas Originais Motor Fusca";
		description = "";
		brand_new_prestige_value = 20;

		value = 350;
		setMaxWear(kmToMaxWear(413000.0));

		maxRPM = 8500.0;

		piston_slot_ID = 42;

		length = 137.00;

		inertia = kgToInertia(8*0.750);

		check4warnings();
	}

}