package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_cabecote_direito_performance extends Part
{
	public tampa_cabecote_direito_performance( int id )
	{
		super( id );
		name = "Tampa Cabecote Direito Performance Dodge 318";
		description = "";

		value = 300;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
