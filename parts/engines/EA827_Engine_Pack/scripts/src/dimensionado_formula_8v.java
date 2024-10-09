package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_formula_8v extends ExhaustHeader
{
	public dimensionado_formula_8v( int id )
	{
		super( id );
		name = "Coletor Dimensionado Formula 4x1 Volkswagen AP 8v";
		description = "";

		value = 500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
