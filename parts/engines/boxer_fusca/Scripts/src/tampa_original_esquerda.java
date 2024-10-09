package java.game.parts.engines.boxer_fusca;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class tampa_original_esquerda extends Part
{
	public tampa_original_esquerda( int id )
	{
		super( id );
		name = "Tampa Esquerda Original Motor Fusca";
		description = "";
		brand_new_prestige_value = 15;

		value = 50;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}


}