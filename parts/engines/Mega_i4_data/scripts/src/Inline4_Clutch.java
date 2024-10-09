package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Inline4_Clutch extends Clutch
{
	public Inline4_Clutch( int id )
	{
		super( id );
		name = "Embreagem universal";
		description = "";

		value = 300;
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(5.5);

		check4warnings();
	}
}
