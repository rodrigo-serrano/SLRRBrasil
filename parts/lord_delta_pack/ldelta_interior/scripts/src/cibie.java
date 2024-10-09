package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class cibie extends DecorativeBodyPart
{
	public cibie( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Cibie Serra II with cover";
		description = "A classic fog light with cover.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
