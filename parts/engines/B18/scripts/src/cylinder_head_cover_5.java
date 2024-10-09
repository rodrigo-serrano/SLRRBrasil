package java.game.parts.engines.B18;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover_5 extends Part
{
	public cylinder_head_cover_5( int id )
	{
		super( id );
		name = "Tampa Velas Honda Serie B";
		description = "";

		value = 70;
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
