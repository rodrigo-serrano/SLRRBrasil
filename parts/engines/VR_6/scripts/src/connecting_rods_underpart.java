package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class connecting_rods_underpart extends EnginePart
{
	public connecting_rods_underpart( int id )
	{
		super( id );
		name = "Mancal De Biela VW VR6";
		description = "";

		value = tHUF2USD(19);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 21 );
		if (!p)
			return "the connecting rods is missing the connecting rods screw.";

		return super.isDynoable();
	}
}
