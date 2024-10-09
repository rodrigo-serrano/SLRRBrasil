package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class vr_6_3_2_exhaust_header extends ExhaustHeader
{
	public vr_6_3_2_exhaust_header( int id )
	{
		super( id );
		name = "Coletor De Escape VW VR6 3.2";
		description = " ";

		brand_new_prestige_value = 36.01;
		value = tHUF2USD(40);
		setMaxWear(kmToMaxWear(200000.0));

		efficiency = 0.96;

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