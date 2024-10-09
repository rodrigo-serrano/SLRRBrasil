package java.game.parts.engines.VIS_Engine_Pack;

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
		name = "Embreagem Fiat V.I.S.";
		description = "";

		value = 350;
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(10.0);

		check4warnings();
	}
}
