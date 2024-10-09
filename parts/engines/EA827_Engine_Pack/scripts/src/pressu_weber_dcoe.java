package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_weber_dcoe extends EnginePart
{
	public pressu_weber_dcoe( int id )
	{
		super( id );
		name = "Pressurizacao Weber DCOE Volkswagen AP 8v";
		description = "";

		value = 420;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
