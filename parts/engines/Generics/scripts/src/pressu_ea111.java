package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_ea111 extends EnginePart
{
	public pressu_ea111( int id )
	{
		super( id );
		name = "Pressurizacao Vw Ea111";
		description = "";

		value = 400;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
