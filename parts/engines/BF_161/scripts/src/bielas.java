package java.game.parts.engines.BF_161;

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
		name = "Bielas Willys BF-161";
		description = "";

		value = 150;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 210.0;

		maxRPM = 7000.0;
		inertia = kgToInertia(5*0.300);

		check4warnings();
	}
}
