package java.game.parts.engines.Mega_i4_data;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Ishima_WR_SuperTurizmo_cylinder_head_cover extends Part
{
	public Ishima_WR_SuperTurizmo_cylinder_head_cover( int id )
	{
		super( id );
		name = "E.Torq 1.8 16v cylinder head cover";
		description = "";
		value = tHUF2USD(30);
		brand_new_prestige_value = 59.30;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
