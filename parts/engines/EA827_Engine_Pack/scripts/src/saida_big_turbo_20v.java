package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_big_turbo_20v extends EnginePart
{
	public saida_big_turbo_20v( int id )
	{
		super( id );
		name = "Saida Turbina Hx50 Volkswagen AP 20v";
		description = "";

		value = 500;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
