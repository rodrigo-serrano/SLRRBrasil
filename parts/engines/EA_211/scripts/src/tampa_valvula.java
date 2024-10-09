package java.game.parts.engines.EA_211;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class tampa_valvula extends Part
{
	public tampa_valvula( int id )
	{
		super( id );
		name = "Tampa Valvula EA-211 3 Cilindros";
		description = "";

		value = 315;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
