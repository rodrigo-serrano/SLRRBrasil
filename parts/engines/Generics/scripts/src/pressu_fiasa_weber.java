package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class pressu_fiasa_weber extends EnginePart
{
	public pressu_fiasa_weber( int id )
	{
		super( id );
		name = "Pressurizacao Fiasa Com Par Weber";
		description = "";

		value = 1200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
