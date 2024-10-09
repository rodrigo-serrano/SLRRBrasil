package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class connecting_rods_4cyl_145er extends ConnectingRod
{
	public connecting_rods_4cyl_145er( int id )
	{
		super( id );
		name = "Bielas Fiat V.I.S. 1.8 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 145.0;

		maxRPM = 8500.0;
		inertia = kgToInertia(4*0.300);

		check4warnings();
	}
}
