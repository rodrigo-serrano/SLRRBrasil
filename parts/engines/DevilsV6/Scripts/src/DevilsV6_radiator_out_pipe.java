package java.game.parts.engines.DevilsV6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class DevilsV6_radiator_out_pipe extends EnginePart
{
	public DevilsV6_radiator_out_pipe( int id )
	{
		super( id );
		name = "Mangueiras Saida Radiador Motor V6";
		description = "";
		brand_new_prestige_value = 8.60;

		value = 150;
		setMaxWear(kmToMaxWear(60000.0));

		check4warnings();
	}
}
