package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class baja extends DecorativeBodyPart
{
	public baja( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Cross fog light";
		description = "A classic fog light.";

		value = tHUF2USD(31);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
