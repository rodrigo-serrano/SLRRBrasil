package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_fiasa extends ExhaustHeader
{
	public dimensionado_fiasa( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Fiasa";
		description = "";

		value = 400;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
