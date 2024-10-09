package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class throttle extends EnginePart
{
	public throttle( int id )
	{
		super( id );
		name = "TBI VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 34 );
		if (!p)
			return "A TBI esta sem os Parafusos.";

		return super.isDynoable();
	}
}

