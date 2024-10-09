package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class clutch_20_turbo extends Clutch
{
	public clutch_20_turbo( int id )
	{
		super( id );
		name = "Embreagem Fiat V.I.S. 20v turbo";
		description = "";

		value = 550;
		brand_new_prestige_value = 31.93;
		setMaxWear(kmToMaxWear(180000.0));

		maxRPM = 10000.0;
		inertia = kgToInertia(12.0);

		check4warnings();
	}
}
