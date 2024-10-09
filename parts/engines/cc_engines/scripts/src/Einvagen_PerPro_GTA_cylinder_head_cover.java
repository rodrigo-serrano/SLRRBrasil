package java.game.parts.engines.cc_engines;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_cylinder_head_cover extends Part
{
	public Einvagen_PerPro_GTA_cylinder_head_cover( int id )
	{
		super( id );
		name = "Volkswagen AT 1.0 16v cylinder head cover";
		description = "An aluminium valve cover painted to red with the Volkswagen EA-113 logos.";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 59.30;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
