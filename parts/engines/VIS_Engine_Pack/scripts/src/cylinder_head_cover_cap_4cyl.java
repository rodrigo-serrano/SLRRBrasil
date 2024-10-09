package java.game.parts.engines.VIS_Engine_Pack;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_cap_4cyl extends Part
{
	public cylinder_head_cover_cap_4cyl( int id )
	{
		super( id );
		name = "Tampa Oleo Fiat V.I.S. 16v";
		description = "";

		value = 25;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
