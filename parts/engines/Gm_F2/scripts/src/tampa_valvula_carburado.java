package java.game.parts.engines.Gm_F2;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula_carburado extends Part
{
	public tampa_valvula_carburado( int id )
	{
		super( id );
		name = "Tampa Cabecote GM F2 8v Antiga";
		description = "";

		value = 150;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
