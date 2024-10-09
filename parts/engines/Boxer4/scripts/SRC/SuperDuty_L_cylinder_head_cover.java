package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class SuperDuty_L_cylinder_head_cover extends Part
{
	public SuperDuty_L_cylinder_head_cover( int id )
	{
		super( id );
		name = "Tampa Cabecote Esquerdo Subaru EJ";
		description = "";
		brand_new_prestige_value = 28.67;

		value = 120;
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}
