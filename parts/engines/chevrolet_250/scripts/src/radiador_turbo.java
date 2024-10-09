package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class radiador_turbo extends EnginePart
{
	public radiador_turbo( int id )
	{
		super( id );
		name = "Radiador Para Kit Turbo / Supercharger Chevrolet 250";
		description = "";

		value = 600;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}