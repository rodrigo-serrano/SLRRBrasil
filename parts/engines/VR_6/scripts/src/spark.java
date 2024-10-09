package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;

public class spark extends EnginePart
{
	public spark( int id )
	{
		super( id );
		name = "Velas VW VR6";
		description = " ";

		value = tHUF2USD(18);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 29 );
		if (!p)
			return "As Velas estao sem Cabos.";

		return super.isDynoable();
	}
}
