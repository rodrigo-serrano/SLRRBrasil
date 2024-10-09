package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_renault_16v extends ExhaustHeader
{
	public dimensionado_renault_16v( int id )
	{
		super( id );
		name = "Coletor Dimensionado Inox Renault 16v";
		description = "";

		value = 1500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 3.00;

		check4warnings();
	}
}
