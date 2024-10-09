package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class turbman extends DecorativeBodyPart
{
	public turbman( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Turbo Boost Gauge without support";
		description = "";

		value = tHUF2USD(21);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
