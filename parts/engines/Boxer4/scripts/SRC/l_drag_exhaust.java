package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class l_drag_exhaust extends ExhaustHeader
{
	public l_drag_exhaust( int id )
	{
		super( id );
		name = "Escapamento Turbina Esquerda Drag Subaru EJ";
		description = "";

		value = 200;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(200000.0));

		efficiency = 1.0;

		check4warnings();
	}
}
