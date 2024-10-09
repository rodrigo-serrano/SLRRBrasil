package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_rwd extends ExhaustHeader
{
	public dimensionado_rwd( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Binotto Performance GM F2 8v";
		description = "";

		value = 750;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
