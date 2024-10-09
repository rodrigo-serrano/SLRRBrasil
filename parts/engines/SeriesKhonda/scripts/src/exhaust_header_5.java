package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_5 extends ExhaustHeader
{
	public exhaust_header_5( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Alternativo Corrida Honda Serie K";
		description = "";

		value = 850;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.16;

		check4warnings();
	}
}
