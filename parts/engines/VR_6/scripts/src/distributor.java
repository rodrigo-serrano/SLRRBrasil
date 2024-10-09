package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class distributor extends EnginePart
{
	public distributor( int id )
	{
		super( id );
		name = "Distribuidor VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 30 );
		if (!p)
			return "the distributor is missing the timing screw.";

		return super.isDynoable();
	}
}

