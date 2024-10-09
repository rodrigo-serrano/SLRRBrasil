package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class radiator_transversal extends EnginePart
{
	public radiator_transversal( int id )
	{
		super( id );
		name = "Radiador Volkswagen AP Transversal";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
