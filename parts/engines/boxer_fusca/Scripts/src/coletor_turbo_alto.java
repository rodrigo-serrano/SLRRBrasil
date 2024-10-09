package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_alto extends ExhaustHeader
{
	public coletor_turbo_alto( int id )
	{
		super( id );
		name = "Coletor Turbo Alto Fusca";
		description = "";
		brand_new_prestige_value = 120;

		value = 1500;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 2.00;// efficiency in percent/100 

		check4warnings();
	}
}