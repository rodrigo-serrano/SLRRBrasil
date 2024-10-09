package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_f1_mpfi extends EnginePart
{
	public pressu_f1_mpfi( int id )
	{
		super( id );
		name = "Pressurizacao GM Familia 1 8v MPFI";
		description = "";

		value = 450;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
