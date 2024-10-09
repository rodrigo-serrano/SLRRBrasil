package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_lada extends ExhaustHeader
{
	public dimensionado_lada( int id )
	{
		super( id );
		name = "Coletor Dimensionado Lada 1.6 8v";
		description = "";

		value = 350;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.00;

		check4warnings();
	}
}
