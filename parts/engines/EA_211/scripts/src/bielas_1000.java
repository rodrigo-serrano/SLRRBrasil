package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class bielas_1000 extends ConnectingRod
{
	public bielas_1000( int id )
	{
		super( id );
		name = "Bielas EA-211 3 Cilindros";
		description = "";

		value = 550;
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(348000.0));

		piston_slot_ID = 39;

		length = 140.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(0.690);

		check4warnings();
	}
}
