package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_D22V_cylinder_head_cover extends Part
{
	public Duhen_D22V_cylinder_head_cover( int id )
	{
		super( id );
		name = "Zetec cylinder head cover";
		description = "";

		value = tHUF2USD(18);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
