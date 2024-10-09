package java.game.parts.engines.CHE_C20XE;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class c20xe_alternator extends Part
{
	public c20xe_alternator( int id )
	{
		super( id );
		name = "C20XE alternator";
		description = "";
		brand_new_prestige_value = 14.52;

		value = tHUF2USD(15);
		setMaxWear(kmToMaxWear(300000.0));
	}
	
	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 19 );
		if (!p)
			return "O Alternador esta sem Correia.";
	
		return super.isDynoable();
	}
}