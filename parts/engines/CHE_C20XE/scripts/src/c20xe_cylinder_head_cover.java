package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class c20xe_cylinder_head_cover extends Part
{
	public c20xe_cylinder_head_cover( int id )
	{
		super( id );
		name = "C20XE cylinder head cover";
		description = "";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 39.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
	
	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 25 );
		if (!p)
			return "O Motor esta sem Cabos De Vela.";

		return super.isDynoable();
	}
}