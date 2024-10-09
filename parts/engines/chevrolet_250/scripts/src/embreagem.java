package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class embreagem extends Clutch
{
	public embreagem( int id )
	{
		super( id );
		name = "Embreagem Chevrolet 250";
		description = "";

		value = 600;
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(5.5);

		check4warnings();
	}
}
