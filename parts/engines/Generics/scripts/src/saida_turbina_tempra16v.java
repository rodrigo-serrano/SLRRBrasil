package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_tempra16v extends EnginePart
{
	public saida_turbina_tempra16v( int id )
	{
		super( id );
		name = "Saida Turbina Hx40";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
