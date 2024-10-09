package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Diesel_WRZ_cylinder_head_cover extends EnginePart
{
	public Diesel_WRZ_cylinder_head_cover( int id )
	{
		super( id );
		name = "Cummins ISBe4 Stock cylinder head cover";
		description = "";

		value = tHUF2USD(78);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(100000000.0));
	}
}
