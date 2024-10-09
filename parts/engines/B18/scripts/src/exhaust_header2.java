package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class exhaust_header2 extends ExhaustHeader
{
	public exhaust_header2( int id )
	{
		super( id );
		name = "Coletor Turbo Dimensionado Defiant Honda Serie B";
		description = "";

		value = 1000;
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 1.75;

		check4warnings();
	}
}
