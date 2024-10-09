package java.game.parts.engines.Boxer4;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class Biturbo_R_pipes extends Part
{
	public Biturbo_R_pipes( int id )
	{
		super( id );
		name = "Pressurizao Biturbo Subaru EJ";
		description = "";

		value = 600;
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(18000.0));

		check4warnings();
	}
}
