package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_tipo extends Part
{
	public tampa_tipo( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Sevel Tipo";
		description = "";

		value = 220;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
