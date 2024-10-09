package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_race extends Part
{
	public cylinder_head_cover_race( int id )
	{
		super( id );
		name = "Tampa Valvula Customizada Honda Serie B";
		description = "";

		value = 300;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
