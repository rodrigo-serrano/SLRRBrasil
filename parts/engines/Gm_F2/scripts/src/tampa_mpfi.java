package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_mpfi extends Part
{
	public tampa_mpfi( int id )
	{
		super( id );
		name = "Tampa Cabecote GM F2 8v Moderno";
		description = "";

		value = 235;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
