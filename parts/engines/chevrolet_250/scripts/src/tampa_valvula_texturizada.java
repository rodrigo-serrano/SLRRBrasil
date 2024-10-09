package java.game.parts.engines.chevrolet_250;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_texturizada extends Part
{
	public tampa_valvula_texturizada( int id )
	{
		super( id );
		name = "Tampa Cabecote FTX Chevrolet 250";
		description = "";

		value = 1400;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
