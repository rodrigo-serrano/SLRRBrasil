package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado extends ExhaustHeader
{
	public dimensionado( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Sevel Binotto Performance";
		description = "";

		value = 500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.20;

		check4warnings();
	}
}
