package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_WRC_cylinder_head_cover extends Part
{
	public Shimutshibu_WRC_cylinder_head_cover( int id )
	{
		super( id );
		name = "Powertech-Lotus cylinder head cover";
		description = "An aluminium valve cover painted to red with the Shimutshibu and WRC logos painted gold.";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 59.30;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
