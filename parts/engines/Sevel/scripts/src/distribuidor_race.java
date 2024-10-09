package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class distribuidor_race extends EnginePart
{
	public distribuidor_race( int id )
	{
		super( id );
		name = "Distribuidor Com Cabos Esportivos Motor Sevel";
		description = "";

		value = 150;
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}
}
