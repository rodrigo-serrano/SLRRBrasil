package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class VR_6_valve_cover3 extends EnginePart
{
	public VR_6_valve_cover3( int id )
	{
		super( id );
		name = "Tampa De Valvula Pintavel VW VR6";
		description = "";

		value = tHUF2USD(19);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

		check4warnings();
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 19 );
		if (!p)
			return "A Tampa De Valvula esta sem Tampa De Oleo.";

                p = partOnSlot( 20 );
		if (!p)
			return "A Tampa De Valvula esta sem Porcas.";

                p = partOnSlot( 21 );
		if (!p)
			return "A Tampa De Valvula esta sem Retorno De Oleo.";

		return super.isDynoable();
	}
}