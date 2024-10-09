package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_tubular_turbo extends ExhaustHeader
{
	public coletor_tubular_turbo( int id )
	{
		super( id );
		name = "Coletor Binotto Performance Dimensionado Tubular Para Turbo Chevrolet 250";
		description = "";

		value = 3200;
		brand_new_prestige_value = 300.0;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 3.50;

		check4warnings();
	}
}
