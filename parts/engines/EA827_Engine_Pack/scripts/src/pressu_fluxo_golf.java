package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_fluxo_golf extends EnginePart
{
	public pressu_fluxo_golf( int id )
	{
		super( id );
		name = "Pressurizacao Volkswagen AP 8v Fluxo Cruzado Golf";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
