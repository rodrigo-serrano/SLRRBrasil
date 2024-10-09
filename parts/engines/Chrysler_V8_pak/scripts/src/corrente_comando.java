package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class corrente_comando extends Part
{
	public corrente_comando( int id )
	{
		super( id );
		name = "Corrente De Comando Dodge 318";
		description = "";

		value = 120;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
