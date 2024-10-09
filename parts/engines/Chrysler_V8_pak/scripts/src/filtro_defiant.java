package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class filtro_defiant extends Part
{
	public filtro_defiant( int id )
	{
		super( id );
		name = "Filtro Cromado";
		description = "";

		brand_new_prestige_value = 15;

		value = 100;
		setMaxWear(100000.0);
		check4warnings();
	}

}