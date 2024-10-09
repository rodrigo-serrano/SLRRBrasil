package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class radiator_transversal_20v extends EnginePart
{
	public radiator_transversal_20v( int id )
	{
		super( id );
		name = "Radiador Volkswagen AP 20v Transversal";
		description = "";

		value = 170;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
