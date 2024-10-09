package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_biturbo extends ExhaustHeader
{
	public coletor_biturbo( int id )
	{
		super( id );
		name = "Coletor Bi-Turbo Binotto Performance VW a Ar";
		description = "";
		brand_new_prestige_value = 120;

		value = 2500;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 4.00;// efficiency in percent/100 

		check4warnings();
	}
}