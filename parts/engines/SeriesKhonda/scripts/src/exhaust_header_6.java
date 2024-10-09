package java.game.parts.engines.SeriesKhonda;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header_6 extends ExhaustHeader
{
	public exhaust_header_6( int id )
	{
		super( id );
		name = "Coletor De Escape Dimensionado Honda Serie K";
		description = "";

		value = 550;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.09;

		check4warnings();
	}
}
