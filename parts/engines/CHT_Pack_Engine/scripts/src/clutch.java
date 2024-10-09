package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class clutch extends Clutch
{
	public clutch( int id )
	{
		super( id );
		name = "Embreagem motor CHT";
		description = "";

		value = tHUF2USD(7.966);
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(3.5);

		check4warnings();
	}
}