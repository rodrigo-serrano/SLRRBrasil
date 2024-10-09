package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class dimensionado_rwd_16v extends ExhaustHeader
{
	public dimensionado_rwd_16v( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado GM F2 16v";
		description = "";

		value = 750;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.50;

		check4warnings();
	}
}
