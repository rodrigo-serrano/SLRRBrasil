package java.game.parts.engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_cabecote_esquerdo_holley extends Part
{
	public tampa_cabecote_esquerdo_holley( int id )
	{
		super( id );
		name = "Tampa Cabecote Esquerdo Holley Dodge 318";
		description = "";

		value = 400;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
