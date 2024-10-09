package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_RC_300_cylinder_head_cover extends Part
{
	public Shimutshibu_RC_300_cylinder_head_cover( int id )
	{
		super( id );
		name = "Powertech II cylinder head cover";
		description = "";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 43.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
