package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_cabecote_direito extends Part
{
	public tampa_cabecote_direito( int id )
	{
		super( id );
		name = "Tampa Cabecote Direito Dodge 318";
		description = "";

		value = 150;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
