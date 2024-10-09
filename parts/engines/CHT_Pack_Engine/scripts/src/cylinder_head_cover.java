package java.game.parts.engines.CHT_Pack_Engine;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class cylinder_head_cover extends Part
{
	public cylinder_head_cover( int id )
	{
		super( id );
		name = "Tampa do cabeçote motor CHT";
		description = "";

		value = tHUF2USD(4.171);
		brand_new_prestige_value = 76.64;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
