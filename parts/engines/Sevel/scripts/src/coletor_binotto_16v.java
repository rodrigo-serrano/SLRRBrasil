package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_binotto_16v extends ExhaustHeader
{
	public coletor_binotto_16v( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Turbo Sevel 16v Binotto Performance";
		description = "";

		value = 2200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.00;

		check4warnings();
	}
}
