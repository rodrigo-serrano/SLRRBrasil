package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class compressor_air_hose2 extends EnginePart
{
	public compressor_air_hose2( int id )
	{
		super( id );
		name = "Intake VW VR6";
		description = "";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 33 );
		if (!p)
			return "the compressor air hose 2 is missing the screw.";

		return super.isDynoable();
	}
}

