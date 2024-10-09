package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_saida_simples extends ExhaustHeader
{
	public dimensionado_saida_simples( int id )
	{
		super( id );
		name = "Coletor 6x1 Dimensionado Binotto Chevrolet 250";
		description = "";

		value = 650;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.50;

		check4warnings();
	}
}
