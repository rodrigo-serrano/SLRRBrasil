package java.game.parts.engines.Sevel;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_uno_turbo extends Part
{
	public tampa_uno_turbo( int id )
	{
		super( id );
		name = "Tampa Cabecote Fiat Uno Turbo 1.4";
		description = "";

		value = 800;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
