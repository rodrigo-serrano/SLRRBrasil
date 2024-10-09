package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class kmh extends DecorativeBodyPart
{
	public kmh( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "KM/H Gauge";
		description = "Gauge of Fiat 850.";

		value = tHUF2USD(26);
		brand_new_prestige_value = 25.00;
		setMaxWear(kmToMaxWear(100000.0));
	}
}
