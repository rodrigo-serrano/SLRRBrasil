package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_ea111 extends EnginePart
{
	public saida_turbina_ea111( int id )
	{
		super( id );
		name = "Saida Turbina 42/48";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
