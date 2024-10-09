package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_dimensionado_16v extends ExhaustHeader
{
	public coletor_turbo_dimensionado_16v( int id )
	{
		super( id );
		name = "Coletor De Escape Turbo Dimensionado GM F2 16v";
		description = "";

		value = 2200;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.75;

		check4warnings();
	}
}
