package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbina_corsa_gsi extends EnginePart
{
	public saida_turbina_corsa_gsi( int id )
	{
		super( id );
		name = "Saida Turbina 50/48";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
