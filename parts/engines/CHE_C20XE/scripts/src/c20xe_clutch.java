package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class c20xe_clutch extends Clutch
{
	public c20xe_clutch( int id )
	{
		super( id );
		name = "C20XE clutch";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxF = 300.0;// adjust clamping force of clutch
		
		maxRPM = 12000.0;
		inertia = kgToInertia(100.5);

		check4warnings();
	}
}