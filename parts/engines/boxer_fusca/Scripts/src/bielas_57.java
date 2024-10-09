package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class bielas_57 extends ConnectingRod
{
	public bielas_57( int id )
	{
		super( id );
		name = "Bielas 5.7 Polegadas Motor Fusca";
		description = "";
		brand_new_prestige_value = 20;

		value = 1700;
		setMaxWear(kmToMaxWear(413000.0));

		maxRPM = 12000.0;

		piston_slot_ID = 42;

		length = 144.780;

		inertia = kgToInertia(8*0.755);

		check4warnings();
	}

}