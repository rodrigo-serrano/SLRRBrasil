package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_tempra8v_carburado extends EnginePart
{
	public pressu_tempra8v_carburado( int id )
	{
		super( id );
		name = "Pressurizacao Fiat Twin Cam 2.0 8v Carburado";
		description = "";

		value = 300;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
