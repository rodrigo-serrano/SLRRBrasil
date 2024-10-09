package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class saida_turbo_16v extends EnginePart
{
	public saida_turbo_16v( int id )
	{
		super( id );
		name = "Saida Turbina Hx40 Volkswagen AP 16v";
		description = "";

		value = 370;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
