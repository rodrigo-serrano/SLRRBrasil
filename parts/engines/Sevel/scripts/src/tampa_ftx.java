package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_ftx extends Part
{
	public tampa_ftx( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Sevel Stronger";
		description = "";

		value = 500;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
