package java.game.parts.engines.VR_6;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class twin_turbo_exhaust_header extends ExhaustHeader
{
	public twin_turbo_exhaust_header( int id )
	{
		super( id );
		name = "Coletor Twin Turbo VW VR6";
		description = "";
		brand_new_prestige_value = 38.45;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.85;
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
