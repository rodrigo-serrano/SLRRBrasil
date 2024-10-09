package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header3 extends ExhaustHeader
{
	public exhaust_header3( int id )
	{
		super( id );
		name = "Coletor Dimensionado Honda Serie B";
		description = "";

		value = 400;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 2.50;

		check4warnings();
	}
}
