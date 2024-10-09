package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class vr_6_2_9_exhaust_header extends ExhaustHeader
{
	public vr_6_2_9_exhaust_header( int id )
	{
		super( id );
		name = "Coletor De Escape VW VR6 2.9";
		description = " ";

		value = tHUF2USD(240);
		brand_new_prestige_value = 153.28;
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.93;

		check4warnings();
        }

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 28 );
		if (!p)
			return "O Coletor De Escape esta sem Porcas.";

		return super.isDynoable();
	}
}