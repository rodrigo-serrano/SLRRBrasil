package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_tempra8v_injetado extends EnginePart
{
	public pressu_tempra8v_injetado( int id )
	{
		super( id );
		name = "Pressurizacao Fiat Twin Cam 2.0 8v Injetado";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
