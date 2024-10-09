package java.game.parts.engines.EA827_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_aluminio extends Part
{
	public tampa_valvula_aluminio( int id )
	{
		super( id );
		name = "Tampa De Cabecote Volkswagen AP 8v Bora";
		description = "";

		value = 150;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
