package java.game.parts.engines.Generics;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_duratec extends ExhaustHeader
{
	public dimensionado_duratec( int id )
	{
		super( id );
		name = "Coletor Dimensionado Inox Ford Duratec 16v";
		description = "";

		value = 2200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.00;

		check4warnings();
	}
}
