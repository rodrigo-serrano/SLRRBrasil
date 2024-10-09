package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class digital extends DecorativeBodyPart
{
	public digital( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Fiat 147 digital instrument panel";
		description = "Adapted from Fiat Uno Turbo.";

		value = tHUF2USD(71);
		brand_new_prestige_value =40.00;
		setMaxWear(kmToMaxWear(220000.0));
	}
}
