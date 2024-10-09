package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_baixo extends ExhaustHeader
{
	public coletor_baixo( int id )
	{
		super( id );
		name = "Coletor 4x1 Baixo Fusca";
		description = "";
		brand_new_prestige_value = 70;

		value = 350;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 2.00;// efficiency in percent/100 

		check4warnings();
	}
}