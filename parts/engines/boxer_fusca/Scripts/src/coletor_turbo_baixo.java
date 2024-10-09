package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_turbo_baixo extends ExhaustHeader
{
	public coletor_turbo_baixo( int id )
	{
		super( id );
		name = "Coletor Turbo Baixo Fusca";
		description = "";
		brand_new_prestige_value = 25;

		value = 700;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 1.85;// efficiency in percent/100 

		check4warnings();
	}
}