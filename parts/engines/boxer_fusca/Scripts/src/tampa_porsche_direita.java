package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class tampa_porsche_direita extends Part
{
	public tampa_porsche_direita( int id )
	{
		super( id );
		name = "Tampa Cabecote Direito Porsche VW a Ar";
		description = "";
		brand_new_prestige_value = 28.67;

		value = 250;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}
