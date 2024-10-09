package java.game.parts.engines.SeriesKhonda;

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
		name = "Embreagem Honda Serie K";
		description = "";

		value = 300;
		brand_new_prestige_value = 25;
		setMaxWear(kmToMaxWear(46000.0));

		maxF = 300.0;

		maxRPM = 13500.0;
		inertia = kgToInertia(6.5);

		check4warnings();
	}
}
