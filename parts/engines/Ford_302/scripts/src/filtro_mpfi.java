package java.game.parts.engines.Ford_302;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class filtro_mpfi extends EnginePart
{
	public filtro_mpfi( int id )
	{
		super( id );
		name = "Filtro de ar MPFI Ford 302";
		description = "";

		value = 350;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
