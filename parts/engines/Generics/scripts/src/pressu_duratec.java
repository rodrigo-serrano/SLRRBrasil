package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_duratec extends EnginePart
{
	public pressu_duratec( int id )
	{
		super( id );
		name = "Pressurizacao Ford Duratec";
		description = "";

		value = 680;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
