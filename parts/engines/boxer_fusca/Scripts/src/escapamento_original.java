package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class escapamento_original extends ExhaustHeader
{
	public escapamento_original( int id )
	{
		super( id );
		name = "Coletor Original Fusca";
		description = "";
		brand_new_prestige_value = 70;

		value = 120;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 1.00;// efficiency in percent/100 

		check4warnings();
	}
}