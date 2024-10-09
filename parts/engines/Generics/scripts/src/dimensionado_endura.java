package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_endura extends ExhaustHeader
{
	public dimensionado_endura( int id )
	{
		super( id );
		name = "Coletor Escape Dimensionado Ford Endura";
		description = "";

		value = 600;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.35;

		check4warnings();
	}
}
