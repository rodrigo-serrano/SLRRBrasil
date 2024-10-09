package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_tempra8v extends EnginePart
{
	public saida_turbina_tempra8v( int id )
	{
		super( id );
		name = "Saida Turbina Tempra Turbo 8v";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
