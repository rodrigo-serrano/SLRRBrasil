package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_22_cromo extends Part
{
	public tampa_22_cromo( int id )
	{
		super( id );
		name = "Tampa Cabecote GM F2 2.2 8v Cromada";
		description = "";

		value = 625;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
