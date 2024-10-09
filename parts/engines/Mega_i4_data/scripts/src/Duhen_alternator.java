package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_alternator extends EnginePart
{
	public Duhen_alternator( int id )
	{
		super( id );
		name = "Duratec/Zetec/CHT Alternator";
		description = "";
		brand_new_prestige_value = 11.50;

		value = tHUF2USD(17);
		setMaxWear(kmToMaxWear(300000.0));
	}
}
