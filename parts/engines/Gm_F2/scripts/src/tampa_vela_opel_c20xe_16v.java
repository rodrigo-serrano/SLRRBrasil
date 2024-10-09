package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_vela_opel_c20xe_16v extends Part
{
	public tampa_vela_opel_c20xe_16v( int id )
	{
		super( id );
		name = "Tampa Cabos De Vela Cabecote Opel C20XE";
		description = "";

		value = 350;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
