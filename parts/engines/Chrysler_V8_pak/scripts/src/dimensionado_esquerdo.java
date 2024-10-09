package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_esquerdo extends ExhaustHeader
{
	public dimensionado_esquerdo( int id )
	{
		super( id );
		name = "Coletor De Escape Esquerdo Dimensionado Dodge 318 Para Cabecote Elderbrock";
		description = "";

		value = 1500;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.25;

		check4warnings();
	}
}
