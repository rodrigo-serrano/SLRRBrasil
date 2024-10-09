package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class tampa_valvula_original_esquerda extends Part
{
	public tampa_valvula_original_esquerda( int id )
	{
		super( id );
		name = "Tampa Esquerda Ford 302";
		description = "";
		brand_new_prestige_value = 15;

		value = 250;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}