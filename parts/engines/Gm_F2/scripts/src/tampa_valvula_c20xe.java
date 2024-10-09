package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_c20xe extends Part
{
	public tampa_valvula_c20xe( int id )
	{
		super( id );
		name = "Tampa Valvula GM F2 16v C20XE";
		description = "";

		value = 700;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
