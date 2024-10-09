package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class correia_supercharles extends Part
{
	public correia_supercharles( int id )
	{
		super( id );
		name = "Correia Supercharger Dodge 318";
		description = "";

		value = 600;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
