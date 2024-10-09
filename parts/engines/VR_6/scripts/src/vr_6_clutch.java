package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class vr_6_clutch extends Clutch
{
	public vr_6_clutch( int id )
	{
		super( id );
		name = "Embreagem VW VR6";
		description = "";

		value = tHUF2USD(55);
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(3.5);

		check4warnings();
	}
}
