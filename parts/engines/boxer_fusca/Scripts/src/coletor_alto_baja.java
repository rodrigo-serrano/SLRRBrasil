package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class coletor_alto_baja extends ExhaustHeader
{
	public coletor_alto_baja( int id )
	{
		super( id );
		name = "Coletor 4x1 Baja";
		description = "";
		brand_new_prestige_value = 25;

		value = 500;
		setMaxWear(kmToMaxWear(83000.0));

		efficiency = 2.20;// efficiency in percent/100 

		check4warnings();
	}
}