package java.game.parts.engines.Zetec_16v;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_tunned extends Part
{
	public cylinder_head_cover_tunned( int id )
	{
		super( id );
		name = "Tampa Silver Top Zetec (Zeta) 16v";
		description = "";

		value = 250;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
