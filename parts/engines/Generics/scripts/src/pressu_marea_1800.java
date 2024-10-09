package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_marea_1800 extends EnginePart
{
	public pressu_marea_1800( int id )
	{
		super( id );
		name = "Pressurizacao Fiat Marea 1.8 16v";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
