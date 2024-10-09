package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_16v extends ExhaustHeader
{
	public dimensionado_16v( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Sevel 16v Binotto Performance";
		description = "";

		value = 1100;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.25;

		check4warnings();
	}
}
