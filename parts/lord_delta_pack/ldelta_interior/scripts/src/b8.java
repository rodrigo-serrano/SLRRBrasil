package java.game.parts.LDelta_Interior;

import java.game.parts.bodypart.*;


public class b8 extends DecorativeBodyPart
{
	public b8( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Bosch 8 inch Speaker";
		description = "A classic speaker.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 30.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
