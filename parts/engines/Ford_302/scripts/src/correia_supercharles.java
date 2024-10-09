package java.game.parts.engines.Ford_302;

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
		name = "Correia Supercharger Ford 302";
		description = "";

		value = 2000;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
