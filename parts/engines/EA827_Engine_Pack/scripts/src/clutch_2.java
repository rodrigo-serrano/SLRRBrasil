package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class clutch_2 extends Clutch
{
	public clutch_2( int id )
	{
		super( id );
		name = "Embreagem Volkswagen AP";
		description = "Stock clutch for stock EA-827 1.8 and 2.0L";

		value = 350;
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(5.5);

		check4warnings();
	}
}