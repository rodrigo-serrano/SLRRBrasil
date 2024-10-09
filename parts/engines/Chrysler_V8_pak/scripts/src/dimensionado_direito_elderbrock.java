package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_direito_elderbrock extends ExhaustHeader
{
	public dimensionado_direito_elderbrock( int id )
	{
		super( id );
		name = "Coletor De Escape Direito Dimensionado Dodge 318";
		description = "";

		value = 1200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.00;

		check4warnings();
	}
}
