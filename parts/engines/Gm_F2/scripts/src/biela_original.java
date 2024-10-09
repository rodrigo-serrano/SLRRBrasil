package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class biela_original extends ConnectingRod
{
	public biela_original( int id )
	{
		super( id );
		name = "Bielas Motor GM F2 Originais 143mm";
		description = "";

		value = 200;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(488000.0));

		piston_slot_ID = 39;

		length = 143.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(5*0.300);

		check4warnings();
	}
}
