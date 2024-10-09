package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class mancal_comando_esc_16v extends SlidingEnginePart
{
	public mancal_comando_esc_16v( int id )
	{
		super( id );
		name = "Capela Comando Escape Sevel 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(250000.0));

		check4warnings();
	}
}
